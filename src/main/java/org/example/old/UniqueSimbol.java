package org.example.old;

public class UniqueSimbol {

    public static void main(String[] args) {
        String line = "bbaacfdac";
        checkCharArray(line);

    }

    public static Character checkCharArray(String str) {
        Integer[] charCount = new Integer[256];

        for (char ch : str.toCharArray()) {
            if (charCount[ch] == null) {
                charCount[ch] = 1;
            } else {
                charCount[ch]++;
            }
        }

        for (char ch : str.toCharArray()) {
            if (charCount[ch] != null && charCount[ch] == 1) {
                System.out.println(ch);
                return ch;
            }
        }
        return null;
    }
}
