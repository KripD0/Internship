package org.example.old;

import java.util.Scanner;

public class DeleteDuplicates {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов массива.");

        int countVariables = scanner.nextInt();
        int[] array = new int[countVariables];
        System.out.println("Вводите элементы массива.");
        for (int i = 0; i < countVariables; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Исходный массив:");

        for (int i = 0; i < countVariables; i++) {
            if (i != countVariables - 1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i] + ".\n");
            }
        }

        int[] deletedArray = deleteDuplicate(array);
        System.out.println("Массив с удаленными дубликатами.");
        for (int i = 0; i < deletedArray.length; i++) {
            if (i != deletedArray.length - 1) {
                System.out.print(deletedArray[i] + ", ");
            } else {
                System.out.print(deletedArray[i] + ".\n");
            }
        }
    }

    public static int[] deleteDuplicate(int[] array) {
        int length = array.length;
        if (length == 0) {
            return array;
        }

        int[] uniqueArray = new int[length];
        int currentIndex = 0;
        for (int i = 0; i < length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < currentIndex; j++) {
                if (array[i] == uniqueArray[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueArray[currentIndex] = array[i];
                currentIndex++;
            }
        }

        int[] resultArray = new int[currentIndex];
        System.arraycopy(uniqueArray, 0, resultArray, 0, currentIndex);
        return resultArray;
    }
}
