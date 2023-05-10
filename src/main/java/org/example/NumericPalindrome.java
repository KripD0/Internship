package org.example;

import java.util.Scanner;

public class NumericPalindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число.");
        long number = scanner.nextLong();
        scanner.close();
        //Сделал просто вызов метода который проверят строку, а так можно сделать математически.
        if(Palindrome.check(String.valueOf(number))){
            System.out.println("Число " + number + " является палиндромом.");
        }
        else {
            System.out.println("Число " + number + " не является палиндромом.");
        }
    }
}
