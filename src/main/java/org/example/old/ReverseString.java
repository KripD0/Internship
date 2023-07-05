package org.example.old;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку которую хотите развернуть.");
        String word = scanner.nextLine();
        String newWord = reverse(word);
        System.out.println("Получившаяся строка: " + newWord);
    }

    public static String reverse(String word) {
        //Лучше пользоваться StringBuilder в данном случае так как часто меняем строку.
        StringBuilder result = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            result.append(word.charAt(i));
        }
        return String.valueOf(result);
    }
}
