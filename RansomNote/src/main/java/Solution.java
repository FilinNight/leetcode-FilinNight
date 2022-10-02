import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/ransom-note/"> 383. Ransom Note </a>
 */
public class Solution {

    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> magazineMap = createMagazineMap(magazine);

        for (char c : ransomNote.toCharArray()) {
            if (magazineMap.containsKey(c)) {
                magazineMap.put(c, magazineMap.get(c) - 1);
                if (magazineMap.get(c) == 0) {
                    magazineMap.remove(c);
                }
            } else {
                return false;
            }
        }
        return true;
    }

    private Map<Character, Integer> createMagazineMap(String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : magazine.toCharArray()) {
            if (!map.containsKey(c)) {
                map.put(c, 0);
            }
            map.put(c, map.get(c) + 1);
        }
        return map;
    }
}
