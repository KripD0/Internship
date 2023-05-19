package org.example.old;

public class UniqueSimbol {

    public static void main(String[] args) {
        String line = "bbaacfdac";
        checkCharArray(line);

    }

    public static Character[] splitString(String line){
        int lineLength = line.length();
        Character[] array = new Character[lineLength];
        for (int i = 0; i < lineLength; i++){
            array[i] = line.charAt(i);
        }
        return array;
    }

    //Сделал для строки, но для массива однотипно там даже не нужно будет разделять.
    public static Character checkCharArray(String line){
        Character[] array = splitString(line);
        boolean flag;
        int arrayLength = array.length;
        for (int i = 0; i < arrayLength; i++){
            flag = false;
            for (int j = 0; j < arrayLength; j++){
                if(array[i] == array[j] && i != j){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                System.out.println("Первый неповторяющийся символ: " + array[i]);
                return array[i];
            }
        }
        System.out.println("Не было найдено неповторяющегося символа.");
        return null;
    }
}
