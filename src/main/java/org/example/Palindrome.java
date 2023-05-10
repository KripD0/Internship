package org.example;

import java.util.Scanner;

public class Palindrome
{

    public static void main( String[] args ){
        String word;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово.");
        word = scanner.nextLine();
        scanner.close();
        if (check(word)){
            System.out.println("Слово " + word + " является палиндромом.");
        }
        else {
            System.out.println("Слово " + word + " не является палиндромом.");
        }
    }

    public static boolean check(String word){
        for (int i = 0; i < word.length() / 2 + 1; i++){
            if(word.toLowerCase().charAt(i) !=  word.toLowerCase().charAt(word.length() - i - 1)){
                return false;
            }
        }
        return true;
    }
}
