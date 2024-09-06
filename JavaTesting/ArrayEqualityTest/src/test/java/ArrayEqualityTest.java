import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class ArrayEqualityTest {

    @Test
    public void testSingleDimensionalArrayEquality() {
        int[] a1 = { 2, 3, 5, 7 };
        int[] a2 = { 2, 3, 5, 7 };
        assertArrayEquals(a1, a2);
    }


    @Test
    public void testMultiDimensionalArrayEquality() {
        int[][] a11 = { { 2, 3 }, { 5, 7 }, { 11, 13 } };
        int[][] a12 = { { 2, 3 }, { 5, 7 }, { 11, 13 } };
        for (int i = 0; i < a11.length; i++) {
            assertArrayEquals(a11[i], a12[i]);
        }
    }

    @Test
    public void testDoubleArrayEquality() {
        double[] d1 = { 1.1, 2.2, 3.3 };
        double[] d2 = { 1.1, 2.2, 3.3 };
        double delta = 0.0001;
        assertArrayEquals(d1, d2, delta);
    }

    @Test
    public void testStringArrayEquality() {
        String[] s1 = { "apple", "banana", "cherry" };
        String[] s2 = { "apple", "banana", "cherry" };
        assertArrayEquals(s1, s2);
    }
}
