package Blind75.EncodeDecode;

import java.util.Arrays;

public class main1 {
    public static void main(String[] args) {
        System.out.println(EncodeDecode.encode(Arrays.asList("neet","code","love","you")));
        System.out.println(EncodeDecode.decode(EncodeDecode.encode(Arrays.asList("neet","code","love","you"))));
    }
}
