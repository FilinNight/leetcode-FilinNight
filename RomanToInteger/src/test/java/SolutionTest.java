import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void romanToIntTest() {
        Solution solution = new Solution();

        assertEquals(0, solution.romanToInt(""));
        assertEquals(5, solution.romanToInt("V"));
        assertEquals(6, solution.romanToInt("VI"));
        assertEquals(8, solution.romanToInt("VIII"));
        assertEquals(9, solution.romanToInt("IX"));
        assertEquals(58, solution.romanToInt("LVIII"));
        assertEquals(1994, solution.romanToInt("MCMXCIV"));
        assertEquals(134, solution.romanToInt("CXXXIV"));
        assertEquals(88, solution.romanToInt("LXXXVIII"));
        assertEquals(521, solution.romanToInt("DXXI"));
        assertEquals(790, solution.romanToInt("DCCXC"));
        assertEquals(3999, solution.romanToInt("MMMCMXCIX"));
        assertEquals(0, solution.romanToInt("MMMM"));
        assertEquals(2222, solution.romanToInt("MMCCXXII"));
        assertEquals(1000, solution.romanToInt("M"));
        assertEquals(57, solution.romanToInt("LVII"));
        assertEquals(149, solution.romanToInt("CXLIX"));
        assertEquals(1695, solution.romanToInt("MDCXCV"));
    }
}
