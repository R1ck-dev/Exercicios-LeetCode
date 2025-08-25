package exercise14;

import java.util.List;

/*
 * Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 */

public class exe14 {
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < strs[0].length(); i++) { 
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length()) {
                    return sb.toString();
                } else if (strs[0].charAt(i) != strs[j].charAt(i)) {
                    return sb.toString();
                }
            }
            sb.append(strs[0].charAt(i));
        }
        return sb.toString();
    }
}
