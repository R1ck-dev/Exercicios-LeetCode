package Blind75.GroupAnagrams;

import java.util.ArrayList;
import java.util.Arrays;
// import java.util.Collections;
import java.util.List;
// import java.util.stream.Stream;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {

        // List<String> strs lengthArrayList<>(Arrays.asList(strs));
        List<List<String>> strsReturnList = new ArrayList<>();
        List<String> insideList = new ArrayList<>();
        int control = 0;

        for (int i = 0; i < strs.length; i++) {
            for (int j = 0; j < strs.length; j++) {
                if (i == j) {
                    continue;
                }
                char[] string1 = strs[i].toCharArray();
                char[] string2 = strs[j].toCharArray();
                Arrays.sort(string1);
                Arrays.sort(string2);
                if (Arrays.equals(string1, string2)) {
                    if (strsReturnList.get(i).contains(strs[i])) {
                        insideList.add(strs[j]);
                        strsReturnList.add(control, new ArrayList<>(insideList));
                        insideList.clear();
                    } else {
                        insideList.add(strs[i]);
                        insideList.add(strs[j]);
                        strsReturnList.add(control, new ArrayList<>(insideList));
                        insideList.clear();
                    }

                }
            }
            if (!(strsReturnList.get(i).contains(strs[i]))) {
                insideList.add(control, strs[i]);
                strsReturnList.add(new ArrayList<>(insideList));
                insideList.clear();
            }
            control++;
        }
        return strsReturnList;
    }
}
