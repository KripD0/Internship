package org.example.unchecked;

public class BoardSolution {

    public static void main(String[] args) {

        char[][] matrix = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        BoardSolution boardSolution = new BoardSolution();
        System.out.println(boardSolution.isValidBoard(matrix));

    }

    public boolean isValidBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            if (!isValidRow(board[i])) {
                return false;
            }
        }

        for (int i = 0; i < board.length; i++) {
            char[] row = new char[board.length];
            for (int j = 0; j < board.length; j++) {
                row[j] = board[j][i];
            }

            if(!isValidRow(row)){
                return false;
            }
        }
        return true;
    }

    public static boolean isValidRow(char[] row) {
        boolean[] check = new boolean[row.length + 1];
        for (char currentChar : row) {
            if (currentChar != '.') {
                if (!Character.isDigit(currentChar)) {
                    return false;
                }

                int currentDigit = currentChar - '0';
                if (check[currentDigit] || currentDigit > 9 || currentDigit < 1) {
                    return false;
                }
                check[currentDigit] = true;
            }
        }
        return true;
    }
}
