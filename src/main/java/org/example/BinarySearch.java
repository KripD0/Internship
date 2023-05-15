package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        //Забыл написать тесты изначально, сейчас написал их, и не знаю нужно ли вообще в main делать вызов функции или он просто будет пустой?
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[]{1, 43, 56, 23, 11, 17, 24, 9, 8, 13, 112, 16, 37};
        Arrays.sort(array);
        System.out.println("Изначальный массив: " + Arrays.toString(array));
        System.out.println("Введите элемент для поиска.");
        int valueToFind = scanner.nextInt();
        System.out.println(binarySearch(array, valueToFind));

    }

    public static int binarySearch(int[] array, int valueToFind){
        int lowIndex = 0;
        int highIndex = array.length - 1;
        while (lowIndex <= highIndex){
            int middleIndex = (lowIndex + highIndex) / 2;
            if(array[middleIndex] == valueToFind){
                return middleIndex;
            }
            else if (array[middleIndex] < valueToFind){
                lowIndex = middleIndex + 1;
            }
            else if (array[middleIndex] > valueToFind){
                highIndex = middleIndex - 1;
            }
        }
        return -1;
    }
}
