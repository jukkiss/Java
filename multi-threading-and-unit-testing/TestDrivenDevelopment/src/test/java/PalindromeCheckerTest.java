import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class PalindromeCheckerTest {
    @Test
    public void testIsPalindrome() {
        PalindromeChecker checker = new PalindromeChecker();

        assertTrue(checker.isPalindrome("radar"), "Should return true for 'radar'");

        assertTrue(checker.isPalindrome("A man, a plan, a canal, Panama"), "Should return true for 'A man, a plan, a canal, Panama'");

        assertFalse(checker.isPalindrome("hello"), "Should return false for 'hello'");

        assertFalse(checker.isPalindrome("openai"), "Should return false for 'openai'");
    }
}
