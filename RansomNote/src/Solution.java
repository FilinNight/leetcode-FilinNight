import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/ransom-note/"> 383. Ransom Note </a>
 */
public class Solution {

    public boolean canConstruct(String ransomNote, String magazine) {
        char[] characters = ransomNote.toCharArray();

        for(char c : characters) {
            if(!magazine.contains(String.valueOf(c))) {
              return false;
            }
        }
        return true;
    }

    public int countChar (char c, String text) {
        int count = 0;
        char[] textToChars = text.toCharArray();

        for (int i = 0; i < textToChars.length; i++) {
            if(c == textToChars[i]) {
                count++;
            }
        }

        return count;
    }

    public void test() {
        Map<String, String> validValues = new HashMap();
        Map<String, String> invalidValues = new HashMap();
        boolean isOk = true;

        validValues.put("aa", "aab");
        validValues.put("a", "ba");
        validValues.put("abc", "cab");
        validValues.put("ab", "b a");
        validValues.put("arfd", "fcahdqr");

        invalidValues.put("aa", "ab");
        invalidValues.put("fd", "dwe");
        invalidValues.put("a", "b");
        invalidValues.put("qweq", "qwe");
        invalidValues.put("qwe", "ewr");

        for(var entry : validValues.entrySet()) {
            if(!canConstruct(entry.getKey(), entry.getValue())) {
                System.out.println(entry.getKey() + " " + entry.getValue());
                isOk = false;
            }
        }

        for(var entry : invalidValues.entrySet()) {
            if(canConstruct(entry.getKey(), entry.getValue())) {
                System.out.println(entry.getKey() + " " + entry.getValue());
                isOk = false;
            }
        }

        if (isOk) {
            System.out.println("\nAll tests passed.\n");
        } else {
            System.out.println("\nAny tests failed!\n");
        }
    }
}
