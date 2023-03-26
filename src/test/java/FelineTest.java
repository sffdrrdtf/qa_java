import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    Feline feline = new Feline();
    @Test
    public void testGetFamily()
    {
        assertEquals("Кошачьи", feline.getFamily());
    }

    Feline fel = new Feline();
    @Test
    public void testEatMeat() throws Exception
    {
        assertEquals( List.of("Животные", "Птицы", "Рыба"), fel.eatMeat());
    }

    Feline tel = new Feline();
    @Test
    public void testGetKittens()
    {
        assertEquals(1, tel.getKittens());
    }
}
