package tasks;

import java.util.*;

public class ValidParentheses {

    public static void main(String[] args) {
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("([])"));
        System.out.println(isValid("([)]"));
        System.out.println(isValid("]"));
        System.out.println(isValid("({{{{}}}))"));
        System.out.println(isValid("([]"));
    }

    public static boolean isValid(String s) {
        boolean isValid = false;
        Map<String, String> pairs = new HashMap<String, String>();
        pairs.put("(", ")");
        pairs.put("{", "}");
        pairs.put("[", "]");
        Stack<String> stack = new Stack<String>();
        for (int i = 0; i < s.length(); i++) {
            if (pairs.get(s.substring(0, 1)) == null) {
                isValid = false;
                break;
            }
            String s0 = s.substring(i, i+ 1);
            if (pairs.get(s0) != null) {
                stack.push(s0);
                isValid = false;
            } else {
                if (!stack.empty() && s0.equals(pairs.get(stack.peek()))) {
                    stack.pop();
                    isValid = true;
                } else {
                    stack.push(s0);
                    isValid = false;
                }
            }
        }
        if (!stack.empty()) {
            isValid = false;
        }
        return  isValid;
    }
}
