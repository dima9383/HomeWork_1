package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int arrayLength = 10;
        int summ = 0;
        int array[] = new int[arrayLength];

        for (int element : array) {
            element = (int) (Math.random() * 100);
            System.out.print(element + " ");
            summ += element == arrayLength ? 0 : element;
        }
        System.out.println();
        System.out.println(summ);

    }


}
