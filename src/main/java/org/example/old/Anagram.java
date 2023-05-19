package org.example.old;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        examination("ananas", "Saaann");
    }

    public static int examination(String firstLine, String secondLine){
        char[] firstWord = splitWord(firstLine);
        char[] secondWord = splitWord(secondLine);

        if(checkAnagram(firstWord,secondWord)){
            System.out.println("Эти слова анограммы.");
            return 1;
        }
        else {
            System.out.println("Эти слова не являются анограммами");
            return -1;
        }
    }

    public static boolean checkAnagram(char[] firstWord, char[] secondWord){
        if(firstWord.length != secondWord.length){
            return false;
        }
        Arrays.sort(firstWord);
        Arrays.sort(secondWord);
        if(Arrays.equals(firstWord,secondWord)){
            return true;
        }
        return false;
    }

    public static char[] splitWord(String line){
        char[] array = new char[line.length()];
        for (int i =0; i < line.length(); i++){
            array[i] = line.toLowerCase().charAt(i);
        }
        return array;
    }
}
