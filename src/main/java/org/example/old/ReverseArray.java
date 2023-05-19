package org.example.old;

import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива.");
        int leghtArray = scanner.nextInt();
        int [] array = new int[leghtArray];
        System.out.println("Вводите значения массива.");
        for (int i = 0; i < leghtArray; i ++){
            array[i] = scanner.nextInt();
        }
        System.out.println("Исходный массив:");
        for (int i = 0; i < array.length; i++){
            if(i != leghtArray - 1){
                System.out.print(array[i] + ", ");
            }
            else {
                System.out.print(array[i] + ".\n");
            }
        }
        int[] reversedArray = reverseArray(array);
        System.out.println("Развернутый массив.");
        for (int i = 0; i < reversedArray.length; i++){
            if(i != leghtArray - 1){
                System.out.print(reversedArray[i] + ", ");
            }
            else {
                System.out.print(reversedArray[i] + ".\n");
            }
        }
    }

    public static int[] reverseArray(int[] array){
        int arrayLeght = array.length;
        for (int i = 0; i < arrayLeght / 2; i ++){
            array[i] += array[arrayLeght - 1 - i];
            array[arrayLeght - 1 - i] = array[i] - array[arrayLeght - 1 - i];
            array[i] -= array[arrayLeght - 1 - i];
        }
        return array;
    }
}
