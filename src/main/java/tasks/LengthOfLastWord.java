package tasks;

public class LengthOfLastWord {

    public static void main(String[] args) {

        String s1 = "Hello World";
        System.out.println(lengthOfLastWord(s1));
        String s2 = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s2));
        String s3 = "luffy is still joyboy";
        System.out.println(lengthOfLastWord(s3));
    }

    public static int lengthOfLastWord(String s) {
        String[] part = s.split(" ");
        String last = part[part.length - 1];
        return last.length();
    }
}
