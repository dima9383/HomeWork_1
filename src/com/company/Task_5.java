package com.company;

public class Task_5 {
    public static void main(String[] args) {

        int x = 7;
        int y = 7;

        int array[][] = new int[x][y];

        boolean needLowTriangle;
        boolean needBrake = false;

        needLowTriangle = true;

        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                array[i][j] = (int) (Math.random() * 100);

                if (needLowTriangle && i < j) {
                    array[i][j] = 0;
                }
//                if (i == 2 && j == 5) {
//                    array[i][j] = 77;
//                }
                System.out.print(array[i][j] + " " + (array[i][j] < 10 ? " " : ""));
            }
            System.out.println();
        }


        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                if (i < j && array[i][j] != 0) {
                    needBrake = true;
                    System.out.println("i=" + i  +" j=" + j + ": " + array[i][j]);
                    System.out.print("не ");
                    break;
                }

                if (i < j) {
                    continue;
                }
            }
            if (needBrake) {
                break;
            }
        }


        System.out.println("является нижней треугольной матрицей");

    }
}
