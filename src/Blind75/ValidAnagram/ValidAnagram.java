package Blind75.ValidAnagram;

import java.util.Arrays;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        if (Arrays.equals(sArray, tArray)) {
            return true;
        }

        return false;
    }
}

// while (j < t1Length) {
// if (s1.charAt(i) == t1.charAt(j)) {
// foundMatch = true;
// s1.deleteCharAt(i);
// s1Length = s1.length();
// t1.deleteCharAt(j);
// t1Length = t1.length();
// continue;
// }
// }
// if (!foundMatch) {
// return false;
// }