import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/roman-to-integer/submissions/"> 13. Roman to Integer. </a>
 */
public class Solution {

    private static final Map<Character, Integer> values = getValue();

    public int romanToInt(String s) {
        if (!this.valid(s)) {
            return 0;
        }

        int result = this.convector(s.toCharArray());

        if (result < 1 || result > 3999) {
            return 0;
        }
        return result;
    }

    private int convector(char[] cv) {
        int result = 0;
        if (cv.length == 1) {
            return values.get(cv[0]);
        }
        for (int i = 0; i < cv.length - 1; i++) {
            int value = values.get(cv[i]);
            int value_next = values.get(cv[i + 1]);

            if (value < value_next) {
                result += value_next - value;
                i = i + 1;
            } else {
                result += value;
            }
        }
        if (values.get(cv[cv.length - 2]) >= values.get(cv[cv.length - 1])) {
            result += values.get(cv[cv.length - 1]);
        }
        return result;
    }

    private static Map<Character, Integer> getValue() {
        Map<Character, Integer> values = new HashMap<>();
        values.put('I', 1);
        values.put('V', 5);
        values.put('X', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('M', 1000);
        return values;
    }

    private boolean valid(String s) {
        if (s.length() > 15 || s.length() < 1) {
            return false;
        }
        for (char c : s.toCharArray()) {
            if (!values.containsKey(c)) {
                return false;
            }
        }
        return true;
    }
}
