package HashTable.CodeWithMosh;

import java.util.HashSet;
import java.util.Set;

public class First_repeated_character {

    public static char firstRepeatedChar(String st){
        Set<Character> set = new HashSet<>();
        char[] chars = st.toCharArray();
        for (char item : chars) {
            if (set.contains(item))
                return item;
            set.add(item);
        }

        return Character.MIN_VALUE;
    }

    public static void main(String[] args) {
        // green apple
        char result = firstRepeatedChar("green apple");
        System.out.println(result);
    }
}
