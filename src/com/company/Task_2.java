package com.company;

public class Task_2 {
    public static void main(String[] args) {

        int arrayLength = 10;
        int summRow = 0;
        int summResult = 0;
        int nextElement = 1;
        int array[] = new int[arrayLength];
        if (arrayLength < 2) {
            return;
        }
        array[0] = 0;
        array[1] = 1;
        System.out.print(array[0] + " " + array[1] + " ");
        for (int i = 2; i < arrayLength; i++) {
            array[i] = array[i - 1] + array[i - 2];
            System.out.print(array[i] + " ");
            summResult += array[i] % 2 == 0 ? array[i] : 0;
        }
        System.out.println();
        System.out.println(summResult);

    }
}
