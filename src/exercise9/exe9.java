package exercise9;

public class exe9 {
    public static Boolean isPalindrome(int x) {
        String xString = Integer.toString(x);
        String reversed = new StringBuilder(xString).reverse().toString();
        return xString.equals(reversed);
    }
}
