package com.company;

import java.lang.reflect.Array;

public class Task_4 {
    public static void main(String[] args) {

        int x = 4;
        int y = 4;
        int element = 0;
        int mult;
        int plusNum = 0;
        int minusNum = 0;
        int array[][] = new int[x][y];

        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                element = (int) (Math.random() * 100);
                if (element > 50) {
                    mult = -1;
                    minusNum++;
                } else {
                    mult = 1;
                    plusNum++;
                }
                element = (int) (Math.random() * 100);
                array[i][j] = element * mult;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Положительные: " + plusNum);
        System.out.println("Отрицательные: " + minusNum);

    }
}
