public class Wednesday15 {
    public static void main(String[] args) {
        printIsPalindrome("Racecar");
        printIsPalindrome("Minecraft");
        printIsPalindrome("Bob");
        printIsPalindrome("Pokemon");
        printIsPalindrome("All of Fo lla");
        printIsPalindrome(null);
    }

    // Check if a string is the same when reversed
    public static Boolean isPalindrome(String str) {
        String stripped = "";

        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);

            if (character != ' ') stripped += character;
        }

        return stripped.equalsIgnoreCase(Friday10.reverseString(stripped));
    }

    public static void printIsPalindrome(String str) {
        // Increased cohesion
        // Also increased coupling (Bad)
        if (str == null) throw new IllegalArgumentException("String must exist!"); // Only objects can be null
        if (isPalindrome(str)) System.out.println("\"" + str + "\" is a palindrome!");
        else System.out.println("\"" + str + "\" is not a palindrome.");
    }
}
