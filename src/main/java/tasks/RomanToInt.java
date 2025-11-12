package tasks;

import java.util.HashMap;

public class RomanToInt {

    public static void main(String[] args) {

        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        int result = 0;
        HashMap<String, Integer> keys = new HashMap<>();
        keys.put("I", 1);
        keys.put("V", 5);
        keys.put("X", 10);
        keys.put("L", 50);
        keys.put("C", 100);
        keys.put("D", 500);
        keys.put("M", 1000);

        for (int i = s.length(); i > 0; i--) {
            String s0 = s.substring(i - 1, i);
            int current = keys.get(s0);
            if (i == s.length()) {
                result += current;
            } else {
                int prev = keys.get(s.substring(i, i + 1));
                if (prev > current) {
                    result -= current;
                } else {
                    result += current;
                }
            }
        }
        return result;
    }
}
