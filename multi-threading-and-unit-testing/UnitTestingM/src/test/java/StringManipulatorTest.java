import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringManipulatorTest {
    StringManipulator manipulator = new StringManipulator();

    @Test
    void testConcatenate() {
        assertEquals("HelloWorld", manipulator.concatenate("Hello", "World"));
        assertEquals("JavaGPT", manipulator.concatenate("Java", "GPT"));
    }

    @Test
    void testFindLength() {
        assertEquals(5, manipulator.findLength("Hello"));
        assertEquals(0, manipulator.findLength(""));
    }

    @Test
    void testConvertToUpperCase() {
        assertEquals("HELLO", manipulator.convertToUpperCase("hello"));
        assertEquals("JAVA", manipulator.convertToUpperCase("Java"));
    }

    @Test
    void testConvertToLowerCase() {
        assertEquals("hello", manipulator.convertToLowerCase("HELLO"));
        assertEquals("java", manipulator.convertToLowerCase("Java"));
    }

    @Test
    void testContainsSubstring() {
        assertTrue(manipulator.containsSubstring("hello", "ell"));
        assertFalse(manipulator.containsSubstring("hello", "abc"));
    }
}
