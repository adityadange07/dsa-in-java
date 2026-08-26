package codeera.top50InterviewQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// What is Two Sum?
public class Question1 {
    public static void main(String[] args) {
        int[] arr = {2,6,1,5,3,4};
        int target = 7;
        twoSumWithBruteForce(arr, target);
        System.out.println();
        twoSumWithOptimalHashMap(arr, target);
    }

    static void twoSumWithBruteForce(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(Arrays.toString(new int[]{i,j}));
                }
            }
        }
    }

    static void twoSumWithOptimalHashMap(int[] arr, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                System.out.println(Arrays.toString(new int[]{map.get(complement), i}));
            }
            map.put(arr[i], i);
        }
    }
}
