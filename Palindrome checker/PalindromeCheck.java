public class PalindromeCheck {
    public static void main(String[] args) {
        String x = "nitin";
        int y = x.length() / 2; 
        boolean isPalindrome = true; 

        for (int i = 0; i < y; i++) {
            if (x.charAt(i) != x.charAt(x.length() - 1 - i)) {
                System.out.println("Your content is not a palindrome");
                isPalindrome = false; 
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Your content is a palindrome");
        }
    }
}
