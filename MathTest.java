import static org.junit.Assert.*;
import org.junit.*;
 
public class MathTest {
    @Test
    public void squareTest() {
        assertEquals(4, MyMath.square(2));
    }
}

