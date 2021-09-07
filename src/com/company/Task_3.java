package com.company;

public class Task_3 {
    public static void main(String[] args) {

        int arrayLength = 6;
        int reserv = 0;
        int array[] = new int[arrayLength];

//        for (int element : array) {
//            element = (int) (Math.random() * 100);
//            System.out.print(element + " ");
//        }


        for (int i = 0; i < arrayLength; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < arrayLength / 2; i++) {
            reserv = array[i];
            array[i] = array[arrayLength - 1 - i];
            array[arrayLength - 1 - i] = reserv;

            System.out.print(array[i] + " ");
        }

        for (int i = arrayLength / 2; i < arrayLength; i++) {
            System.out.print(array[i] + " ");
        }


    }
}
