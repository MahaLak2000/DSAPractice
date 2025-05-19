import java.util.*;

public class Anagram {


        public static void main(String[] args) {
            String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
            List<List<String>> groupedAnagrams = groupAnagrams(input);
            // Print the grouped anagrams
            for (List<String> group : groupedAnagrams) {
                System.out.println(group);
            }
        }
        public static List<List<String>> groupAnagrams(String[] strs) {
            Map<String, List<String>> map = new HashMap<>();
            for (String str : strs) {
                char[] chars = str.toCharArray();
                Arrays.sort(chars);
                String key = new String(chars);
                map.putIfAbsent(key, new ArrayList<>());
                map.get(key).add(str);
            }
            return new ArrayList<>(map.values());
        }
    }

