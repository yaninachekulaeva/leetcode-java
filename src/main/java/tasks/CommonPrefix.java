package tasks;

import java.util.Arrays;

public class CommonPrefix {

    public static void main(String[] args) {
        String[] strs = new String[3];
        strs[0] = "flower";
        strs[1] = "flow";
        strs[2] = "flight";
        String result = longestCommonPrefix(strs);
        System.out.println(result);
    }


    public static String longestCommonPrefix(String[] strs) {
        String prefix = "";
        for (int i = 0; i < strs[0].length(); i++) {
            String pre = strs[0].substring(0, i+1);
            for (int j = 1; j < strs.length; j++) {
                if (Arrays.stream(strs).allMatch(s -> s.startsWith(pre))) {
                    prefix = pre;
                }
            }
        }
        return prefix;
    }
}
