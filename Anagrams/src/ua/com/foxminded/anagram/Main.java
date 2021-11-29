package ua.com.foxminded.anagram;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Anagram anagram = new Anagram();
        String text = inputText();
        String outputText = anagram.reverseText(text);
        System.out.print("Output reversed text: " + outputText);
    }

    public static String inputText() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the text: ");
        return scanner.nextLine();
    }

}
