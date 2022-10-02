import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {


    @Test
    public void canConstructTest() {
        Solution solution = new Solution();

        assertTrue(solution.canConstruct("aa", "aab"), "ransomNote: 'aa', magazine: 'aab'");
        assertTrue(solution.canConstruct("a", "ba"), "ransomNote: 'a', magazine: 'ba'");
        assertTrue(solution.canConstruct("abc", "cab"), "ransomNote: 'abc', magazine: 'cab'");
        assertTrue(solution.canConstruct("ab", "b a"), "ransomNote: 'ab', magazine: 'b a'");
        assertTrue(solution.canConstruct("arfd", "fcahdqr"), "ransomNote: 'aefd', magazine: 'fcahdqr'");
        assertTrue(solution.canConstruct("qwe", "qweqwe"), "ransomNote: 'qwe', magazine: 'ewr'");

        assertFalse(solution.canConstruct("aa", "ab"), "ransomNote: 'aa', magazine: 'ab'");
        assertFalse(solution.canConstruct("fd", "dwe"), "ransomNote: 'fd', magazine: 'dwe'");
        assertFalse(solution.canConstruct("a", "b"), "ransomNote: 'a', magazine: 'b'");
        assertFalse(solution.canConstruct("qweq", "qwe"), "ransomNote: 'qweq', magazine: 'qwe'");
        assertFalse(solution.canConstruct("qwe", "ewr"), "ransomNote: 'qwe', magazine: 'ewr'");
        assertFalse(solution.canConstruct("qweqwe", "qwe"), "ransomNote: 'qwe', magazine: 'ewr'");
    }
}
