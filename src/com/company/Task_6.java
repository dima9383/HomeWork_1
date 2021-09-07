package com.company;

public class Task_6 {
    public static void main(String[] args) {

        int arrSize = 6;

        int array_1[][] = new int[arrSize][arrSize];
        int array_2[][] = new int[arrSize][arrSize];
        int arrayResultPlus[][] = new int[arrSize][arrSize];
        int arrayResultMinus[][] = new int[arrSize][arrSize];

        for (int i = 0; i < arrSize; i++) {
            for (int j = 0; j < arrSize; j++) {

                array_1[i][j] = (int) (Math.random() * 100);
                array_2[i][j] = (int) (Math.random() * 100);
                System.out.print(array_1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < arrSize; i++) {
            for (int j = 0; j < arrSize; j++) {
                System.out.print(array_2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println("Сложение");
        for (int i = 0; i < arrSize; i++) {
            for (int j = 0; j < arrSize; j++) {

                arrayResultPlus[i][j] = array_1[i][j] + array_2[i][j];
                arrayResultMinus[i][j] = array_1[i][j] - array_2[i][j];
                System.out.print(arrayResultPlus[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println("Вычитание");
        for (int i = 0; i < arrSize; i++) {
            for (int j = 0; j < arrSize; j++) {
                System.out.print(arrayResultMinus[i][j] + " ");
            }
            System.out.println();
        }


    }

}
