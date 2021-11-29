package ua.com.foxminded.anagram;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Anagram {

    public String reverseText(String text) {
        if (text == null) {
            throw new IllegalArgumentException("Input data can't be null");
        }
        String[] words = text.split(" ");
        return Arrays.stream(words).map(this::reverseWord).collect(Collectors.joining(" "));
    }

    private String reverseWord(String word) {
        char[] wordCharacters = word.toCharArray();
        for (int i = 0, j = wordCharacters.length - 1; i < j;) {
            if (!Character.isAlphabetic(wordCharacters[i])) {
                i++;
            } else if (!Character.isAlphabetic(wordCharacters[j])) {
                j--;
            } else {
                char current = wordCharacters[i];
                wordCharacters[i] = wordCharacters[j];
                wordCharacters[j] = current;
                i++;
                j--;
            }
        }
        return String.valueOf(wordCharacters);
    }

}