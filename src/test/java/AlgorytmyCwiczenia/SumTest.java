package AlgorytmyCwiczenia;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class SumTest {

    Sum s = new Sum();

    @Test
    public void Test1()
    {
        assertEquals(-1, s.GetSum(0, -1));
        assertEquals(1, s.GetSum(0, 1));
    }

    @Test
    public void TestSame() {
        assertEquals(-3, s.GetSum(-3, -3));

    }

    @Test
    public void TestNegative() {
        assertEquals(-7, s.GetSum(-3, -4));

    }

    @Test
    public void TestPositive() {
        assertEquals(7, s.GetSum(3, 4));

    }
}