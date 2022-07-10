package main;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/roman-to-integer
public class RomanToInteger {

    private static final Map<Character, Integer> values = getValue();

    public static void main(String[] args) {
        RomanToInteger romanToInteger = new RomanToInteger();
        String s = "IV";

        int result = romanToInteger.romanToInt(s);

        System.out.println(result);
        System.out.println(romanToInteger.valid("Vz"));

    }

    public int romanToInt(String s) {
        char[] cv = s.toCharArray();
        String sResult = "";
        int tmp = 0;

        if(!this.valid(s)) {
            return 0;
        }

        for (int i = 0; i < cv.length -1; i++) {
            tmp = cv[i];

        }



        int iResult = Integer.getInteger(sResult);
        if(iResult < 1 || iResult > 3999) {
            return 0;
        }
        return iResult;
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

    private void test() {
        String v1 = "VI";        // 6
        String v2 = "VIII";      // 8
        String v3 = "IX";        // 9
        String v4 = "LVIII";     // 58
        String v5 = "MCMXCIV";   // 1996
        String v6 = "CXXXIV";    // 134
        String v7 = "LXXXVIII";  // 88
        String v8 = "DXXI";      // 521
        String v9 = "DCCXC";     // 790
        String v10 = "MMMCMXCIX"; // 3999
        String v11 = "MMMM";      // 4000 !
        String v12 = "MMCCXXII";  // 2222
        String v13 = "M";         // 1000
        String v14 = "LVII";      // 57
        String v15 = "CXLIX";     // 149

        System.out.println("v1: " + (this.romanToInt(v1) == 6) + "  (" + v1 + " -> " + this.romanToInt(v1) + ")" );
        System.out.println("v2: " + (this.romanToInt(v2) == 8) + "  (" + v2 + " -> " + this.romanToInt(v2) + ")");
        System.out.println("v3: " + (this.romanToInt(v3) == 9) + "  (" + v3 + " -> " +  this.romanToInt(v3) + ")");
        System.out.println("v4: " + (this.romanToInt(v4) == 58) + "  (" + v4 + " -> " +  this.romanToInt(v4) + ")");
        System.out.println("v5: " + (this.romanToInt(v5) == 1996) + "  (" + v5 + " -> " +  this.romanToInt(v5) + ")");
        System.out.println("v6: " + (this.romanToInt(v6) == 134) + "  (" + v6 + " -> " +  this.romanToInt(v6) + ")");
        System.out.println("v7: " + (this.romanToInt(v7) == 88) + "  (" + v7 + " -> " +  this.romanToInt(v7) + ")");
        System.out.println("v8: " + (this.romanToInt(v8) == 521) + "  (" + v8 + " -> " +  this.romanToInt(v8) + ")");
        System.out.println("v9: " + (this.romanToInt(v9) == 790) + "  (" + v9 + " -> " +  this.romanToInt(v9) + ")");
        System.out.println("v10: " + (this.romanToInt(v10) == 3999) + "  (" + v10 + " -> " +  this.romanToInt(v10) + ")");
        System.out.println("v11: " + !(this.romanToInt(v11) == 4000) + "  (" + v11 + " -> " +  this.romanToInt(v11) + ")");
        System.out.println("v12: " + (this.romanToInt(v12) == 2222) + "  (" + v12 + " -> " +  this.romanToInt(v12) + ")");
        System.out.println("v13: " + (this.romanToInt(v13) == 1000) + "  (" + v13 + " -> " +  this.romanToInt(v13) + ")");
        System.out.println("v14: " + (this.romanToInt(v14) == 57) + "  (" + v14 + " -> " +  this.romanToInt(v14) + ")");
        System.out.println("v15: " + (this.romanToInt(v15) == 149) + "  (" + v15 + " -> " +  this.romanToInt(v15) + ")");
    }
}
