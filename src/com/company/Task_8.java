package com.company;

public class Task_8 {
    public static void main(String[] args) {

        int step = 0;
        int ind = 0;
        boolean forward = true;
        boolean rubAdd = false;

        int array[] = {1, 2, 3, 4, 5, 3, 2, 1, 2, 6, 5, 4, 3, 3, 2, 1, 1, 3, 3, 3, 4, 2};
        int arrayRub[] = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            arrayRub[i] = 1;
            System.out.print(arrayRub[i] + " ");
        }

        while (step < array.length) {
            step++;
            forward = step % 2 == 1;

            for (int i = 1; i < array.length; i++) {
                rubAdd = false;
                if (forward) {
                    ind = i;
                } else {
                    ind = array.length - 1 - i;
                }

                if (forward && (arrayRub[ind] > arrayRub[ind - 1])) {
                    arrayRub[ind] += 1;
                    rubAdd = true;
                }

                if (!rubAdd) {
                    break;
                }

            }
        }

        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(arrayRub[i] + " ");
        }

    }
}
