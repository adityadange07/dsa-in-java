package codeera.top50InterviewQuestions;

import java.util.*;

// Group Anagrams?
public class Question2 {
    public static void main(String[] args) {
        String[] arr = new String[]{"eat","tea","tan","ate","nat","bat"};
        groupAnagramsWithSimpleNCommon(arr);
        System.out.println();
        groupAnagramsWithCharacterCountAsKey(arr);
    }

    static void groupAnagramsWithSimpleNCommon(String[] arr) {
        Map<String,List<String>> map = new HashMap<>();
        for (String str : arr) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }
        System.out.println(map.values());
    }

    static void groupAnagramsWithCharacterCountAsKey(String[] arr) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : arr) {
            int[] count = new int[26];
            for (char c : str.toCharArray()) {
                count[c - 'a']++;
            }

            StringBuilder sb = new StringBuilder();
            for (int num : count) {
                sb.append(num).append('#');
            }
            String key = sb.toString();
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }
        System.out.println(map.values());
    }
}
