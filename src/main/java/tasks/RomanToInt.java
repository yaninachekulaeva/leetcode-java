package tasks;

import java.util.HashMap;

public class RomanToInt {

    public static void main(String[] args) {

    }

    public int romanToInt(String s) {
        int result = 0;
        HashMap<String, Integer> keys = new HashMap<String, Integer>();
        keys.put("I", 1);
        keys.put("V", 5);
        keys.put("X", 10);
        keys.put("L", 50);
        keys.put("C", 100);
        keys.put("D", 500);
        keys.put("M", 1000);

        for (int i = s.length()-1; i >= 0; i--) {

        }
        return result;

    }
}
