import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;
@RunWith(Parameterized.class)
public class FelineGetKittensTest {
  private final  int expected;
  private final int kittensCount;
    public  FelineGetKittensTest(int expected, int kittensCount) {
        this.expected = expected;
        this.kittensCount = kittensCount;
    }
    @Parameterized.Parameters
    public static Object[][] getInt() {
        return new Object[][]{
                {1,1},
                {2,2},
                {3,3},
        };
    }
    @Test
    public void checkGetKittensCount() {
        Feline tel = new Feline();
        int actual =  tel.getKittens(kittensCount);
        assertEquals(expected, actual);
    }
}
