import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    private static final Map<Character, Integer> values = getValue();

    public int romanToInt(String s) {
        if(!this.valid(s)) {
            return 0;
        }

        int result = this.convector(s.toCharArray());

        if(result < 1 || result > 3999) {
            return 0;
        }
        return result;
    }

    private int convector(char[] cv) {
        int result = 0;
        if (cv.length == 1) {
            return values.get(cv[0]);
        }
        for (int i = 0; i < cv.length -1; i++) {
            int value = values.get(cv[i]);
            int value_next = values.get(cv[i + 1]);

            if (value < value_next) {
                result += value_next - value;
                i = i + 1;
            }
            else {
                result += value;
            }
        }
        if (values.get(cv[cv.length-2]) >= values.get(cv[cv.length-1])) {
            result += values.get(cv[cv.length-1]);
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
        if(s.length() > 15 || s.length() < 1) {
            return false;
        }
        for (char c : s.toCharArray()) {
            if(!values.containsKey(c)) {
                return false;
            }
        }
        return true;
    }

    public void test() {
        Map<String, Integer> testValues = new HashMap<>();
        testValues.put("", 0);
        testValues.put("V", 5);
        testValues.put("VI", 6);
        testValues.put("VIII", 8);
        testValues.put("IX", 9);
        testValues.put("LVIII", 58);
        testValues.put("MCMXCIV", 1994);
        testValues.put("CXXXIV", 134);
        testValues.put("LXXXVIII", 88);
        testValues.put("DXXI", 521);
        testValues.put("DCCXC", 790);
        testValues.put("MMMCMXCIX", 3999);
        testValues.put("MMMM", 0);
        testValues.put("MMCCXXII", 2222);
        testValues.put("M", 1000);
        testValues.put("LVII", 57);
        testValues.put("CXLIX", 149);
        testValues.put("MDCXCV", 1695);

        boolean testsFailed = false;

        for (Map.Entry<String, Integer> entry : testValues.entrySet()) {
            int result = this.romanToInt(entry.getKey());
            if (result != entry.getValue()) {
                testsFailed = true;
                System.out.println(entry.getKey() + " != " + entry.getValue() + " (" + result + ")");
            }
        }
        if (!testsFailed) {
            System.out.println("\nAll tests passed.\n");
        } else {
            System.out.println("\nAll tests failed!\n");
        }
    }
}
