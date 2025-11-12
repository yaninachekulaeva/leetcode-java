package tasks;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int x) {
        boolean result = false;
        String str = Integer.toString(x);
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.substring(i, i+1);
        }
        System.out.println(reversed);
        if (str.equals(reversed)) result = true;
        System.out.println(result);
        return result;
    }
}
