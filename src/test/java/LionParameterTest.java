import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParameterTest {
    private final  boolean expected;
    private final String sex;

    public  LionParameterTest(boolean expected, String sex) {
        this.expected = expected;
        this.sex = sex;
    }
    @Parameterized.Parameters
    public static Object[][] getSex() {
        return new Object[][]{
                {true,"Самец"},
                {false,"Самка"},
        };
    }
    Feline feline = Mockito.mock(Feline.class);
    @Test
    public void CheckGetSex() throws Exception {
        Lion tel = new Lion(sex, feline);
        boolean actual = tel.doesHaveMane();
        assertEquals(expected, actual);
    }
}
