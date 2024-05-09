package Soal2;

import java.util.Scanner;

public class PalindromeChecker {
    public static boolean isPalindrome(String word) {
        word = word.toLowerCase();

        int length = word.length();
        for(int i = 0; i < length / 2; i++) {
            if(word.charAt(i) != word.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String choice;

        do {
            System.out.print("Enter a word : ");
            String word = input.nextLine();

            System.out.println(isPalindrome(word) ? "This word is a palindrome." : "This word is not a palindrome.");

            System.out.print("Do you want to continue? [Yes/No]: ");
            choice = input.nextLine();
        } while (choice.equalsIgnoreCase("yes"));
    }
}
