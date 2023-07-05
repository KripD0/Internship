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
        int arrayLeght = array.length;
        int[] deleteIndex = new int[arrayLeght];
        int countDuplicate = 0;
        for (int i = 0; i < arrayLeght; i++) {
            for (int j = i + 1; j < arrayLeght; j++) {
                if (array[i] == array[j]) {
                    boolean flag = false;
                    for (int k = 0; k < countDuplicate; k++) {
                        if (deleteIndex[k] == j) {
                            flag = true;
                        }
                    }
                    if (!flag) {
                        deleteIndex[countDuplicate] = j;
                        countDuplicate++;
                    }
                }
            }
        }
        int[] deletedArray = new int[arrayLeght - countDuplicate];
        int count = 0;
        for (int i = 0; i < arrayLeght; i++) {
            boolean flag = false;
            for (int j = 0; j < countDuplicate; j++) {
                if (i == deleteIndex[j]) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                deletedArray[count] = array[i];
                count++;
            }
        }
        return deletedArray;
    }
}
