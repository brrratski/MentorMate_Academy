package DataStructures;

public class SumOfDiagonals {
    public static void main(String[] args) {
        int firstDiagonalSum = 0;
        int secondDiagonalSum = 0;

        int[][] numbers = new int[4][4];
        numbers[0][0] = 1;
        numbers[0][1] = 2;
        numbers[0][2] = 3;
        numbers[0][3] = 4;
        numbers[1][0] = 5;
        numbers[1][1] = 6;
        numbers[1][2] = 7;
        numbers[1][3] = 8;
        numbers[2][0] = 9;
        numbers[2][1] = 10;
        numbers[2][2] = 11;
        numbers[2][3] = 12;
        numbers[3][0] = 13;
        numbers[3][1] = 14;
        numbers[3][2] = 15;
        numbers[3][3] = 16;

        for (int i = 0; i <= 3; i++) {
            firstDiagonalSum += numbers[i][i];
        }


        for (int row = 0; row <= 3; row++) {
            for (int col = 3; col >= 0; col--) {
                if(row + col == 3) {
                    secondDiagonalSum += numbers[row][col];
                }
            }
        }

        System.out.println(firstDiagonalSum);
        System.out.println(secondDiagonalSum);  

    }
}