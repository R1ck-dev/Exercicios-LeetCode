package Blind75.ProductsOfArray;

import java.util.ArrayList;
import java.util.List;

public class Products {
    public static int[] productExceptSelf(int[] nums) {

        List<Integer> numsList = new ArrayList<>();
        List<Integer> returnList = new ArrayList<>();

        for (int num : nums) {
            numsList.add(num);
        }

        // int control = 0;

        for (int i = 0; i < numsList.size(); i++) {
            int produto = 1;
            for (int j = 0; j < numsList.size(); j++) {
                if (i == j) {
                    continue;
                }
                produto *= numsList.get(j);
            }

            returnList.add(produto);

        }

        int[] returnArray = new int[returnList.size()];

        for (int i = 0; i < returnList.size(); i++) {
            returnArray[i] = returnList.get(i);
        }

        return returnArray;
    }
}
