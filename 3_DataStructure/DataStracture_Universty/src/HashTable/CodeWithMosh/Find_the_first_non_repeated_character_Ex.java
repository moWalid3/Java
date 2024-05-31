package HashTable.CodeWithMosh;

import java.util.HashMap;
import java.util.Map;


public class Find_the_first_non_repeated_character_Ex {
    public static char findFirstNonRepeated(String st) {
        Map<Character,Integer> map = new HashMap<>();
        char[] ch = st.toCharArray();

        for (char item : ch) {
            int count = map.getOrDefault(item, 0);
            map.put(item, count + 1);
        }

        for (char item : ch)
            if (map.get(item)==1)
                return item;

        return Character.MIN_VALUE;
    }
    public static void main(String[] args) {
        // assume all input is lowerCase
        char result = findFirstNonRepeated("a green apple");
        System.out.println(result);

    }
}
