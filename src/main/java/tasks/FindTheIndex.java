package tasks;

public class FindTheIndex {

    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad", "sad"));
        System.out.println(strStr("hello", "ll"));
    }

    public static int strStr(String haystack, String needle) {
        if (haystack.contains(needle)) {
            for (int i = 0; i < haystack.length(); i++) {
                if (haystack.startsWith(needle, i)) {
                    return i;
                }
            }
            return -1;
        } else {
            return -1;
        }
    }
}
