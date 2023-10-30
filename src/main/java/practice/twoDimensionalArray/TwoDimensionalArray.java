package practice.twoDimensionalArray;

public class TwoDimensionalArray {

    public static final char SYMBOL = 'X';

    public static char[][] getTwoDimensionalArray(int size) {

        char[][] array = new char[size][size];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (i == j ) {
                    array[i][j] = SYMBOL;
                } else {
                    array[i][j] = ' ';
                }
            }
        }

        char[] temp;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[array.length - i - 1];
            array[array.length - i - 1] = array[i];
            array[i] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (i == j ) {
                    array[i][j] = SYMBOL;
                }
                System.out.print(" " + array[i][j] + " ");
            }
            System.out.println();
        }

        //TODO: Написать метод, который создаст двумерный массив char заданного размера.
        // массив должен содержать символ SYMBOL по диагоналям, пример для size = 3
        // [X,  , X]
        // [ , X,  ]
        // [X,  , X]

        return array;
    }
}
