import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    Feline mock;
    @Test
    public void testGetSound()
    {
        Cat cat = new Cat(mock);
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void testGetFood() throws Exception
    {
       Cat cat = new Cat(new Feline());
        assertEquals("Список еды не совпадает", List.of("Животные", "Птицы", "Рыба"),
                cat.getFood());
    }
}