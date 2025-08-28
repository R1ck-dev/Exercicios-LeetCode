// package LeetCode.exercise20;

// import java.util.Arrays;
// import java.util.HashMap;
// import java.util.List;
// import java.util.Map;

// public class exe20 {
//     public static boolean isValid(String s) {

//         //Bollean[] {Open, Closed}, Integer[] {Open, Closed}
//         Map<List<Boolean>, List<Integer>> parentheses =  new HashMap<>();
//         parentheses.put(Arrays.asList(false, false), Arrays.asList(0, 0));

//         Map<List<Boolean>, List<Integer>> braces =  new HashMap<>();
//         braces.put(Arrays.asList(false, false), Arrays.asList(0, 0));

//         Map<List<Boolean>, List<Integer>> brackets =  new HashMap<>();
//         brackets.put(Arrays.asList(false, false), Arrays.asList(0, 0));

//         List<Character> closingChar = List.of(')', '}', ']');

//         if (closingChar.stream().anyMatch(c -> c == s.charAt(0))) {
//             return false;
//         }

//         for (int i = 0; i < s.length(); i++) {
//             if (s.charAt(i) == '(') { parentheses.values()[0] += 1;}
//         }

//     return true;

//     }
// }
