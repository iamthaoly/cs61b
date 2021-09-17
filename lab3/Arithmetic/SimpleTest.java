import static org.junit.Assert.*;
import org.junit.Test;

public class SimpleTest {

    @Test
    public void test1() {
        int res = 4 * 5 - 2;
        assertEquals(18, res);
        assertTrue(res == 18);
    }
}
