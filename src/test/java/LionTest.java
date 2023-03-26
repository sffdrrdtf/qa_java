import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.*;
import static org.mockito.Mockito.times;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Test
    public void testGetKittens() throws Exception {
        Lion lion = new Lion("Самец",new Feline());
        assertEquals(1, lion.getKittens());
    }
    @Mock
    Feline feline;
    @Test
    public void testGetFood() throws Exception {
        Lion lion = new Lion("Самец",feline);
        lion.getFood();
        Mockito.verify(feline, times(1)).getFood("Хищник");
    }
    @Test
    public void testLionException()  {
        try {
            new Lion("", feline);
            Assert.fail("Expected Exception");
        } catch (Exception thrown) {
            Assert.assertEquals("Используйте допустимые значения пола животного - самец или самка",
                    thrown.getMessage());
        }
    }
}
