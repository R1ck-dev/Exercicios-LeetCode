package Blind75.EncodeDecode;

import java.util.ArrayList;
import java.util.List;

public class EncodeDecode {
    public static String encode(List<String> strs) {

        StringBuilder encodedString = new StringBuilder();

        for (String string : strs) {
            encodedString.append(string.length());
            encodedString.append("#");
            encodedString.append(string);
        }

        return encodedString.toString();
    }

    public static List<String> decode(String str) {

        List<String> decodedStringList = new ArrayList<>();
        int i = 0;

        while(i < str.length()) {
            int delimiterIndex = str.indexOf('#', i);

            int length = Integer.parseInt(str.substring(i, delimiterIndex));

            int startIndex = delimiterIndex + 1;
            int endIndex = startIndex + length;

            decodedStringList.add(str.substring(startIndex, endIndex));

            i = endIndex;
        }

        return decodedStringList;
    }
}
