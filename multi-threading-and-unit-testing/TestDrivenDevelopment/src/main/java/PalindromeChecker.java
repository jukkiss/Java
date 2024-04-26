public class PalindromeChecker {

    public boolean isPalindrome(String str) {
        // Normalize the string
        str = str.toLowerCase().replaceAll("[^a-z0-9]", "");

        // Check for palindrome
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
