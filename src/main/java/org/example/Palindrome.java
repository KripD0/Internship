package org.example;

import java.util.Scanner;

public class Palindrome
{

    public static void main( String[] args ){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово.");
        String word = scanner.nextLine();
        scanner.close();
        if (check(word)){
            System.out.println("Слово " + word + " является палиндромом.");
        }
        else {
            System.out.println("Слово " + word + " не является палиндромом.");
        }
    }

    public static boolean check(String word){
        int wordLength = word.length();
        for (int i = 0; i < wordLength / 2 + 1; i++){
            char firstHalfLetter = word.toLowerCase().charAt(i);
            char secondHalfLetter = word.toLowerCase().charAt(wordLength - i - 1);
            if(firstHalfLetter != secondHalfLetter){
                return false;
            }
        }
        return true;
    }
}
