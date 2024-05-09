package Soal2;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
    public static boolean areAnagram(String word1, String word2) {
        char[] charArray1 = word1.toCharArray();
        char[] charArray2 = word2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word1, word2;
        String choice;

        do {
            System.out.print("Enter the first word : ");
            word1 = input.nextLine();

            System.out.print("Enter the second word : ");
            word2 = input.nextLine();

            System.out.println(areAnagram(word1, word2) ? "These words are anagram." : "These words are not anagram.");

            System.out.print("Do you want to continue? [Yes/No]: ");
            choice = input.nextLine();
        } while (choice.equalsIgnoreCase("yes"));
    }
}
