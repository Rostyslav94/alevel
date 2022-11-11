package com.dubyna;

public class Main5 {
    public static void ex1(String[] args) {
            int [] array = new int[12];
            int maxNumber = -16;
            int maxIndex = 0;
            for (int i = 0; i < array.length; i++) {
                array[i] = (int)(Math.random()*31)-15;
                if(maxNumber <= array[i]){
                    maxNumber = array[i];
                    maxIndex = i;
                }
            }
            System.out.println("maximum index: " + maxIndex);
        }

    public static void ex2(String[] args) {
        int[] array1 = new int[8];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int)(Math.random() * 9 - 1);
            System.out.print(array1[i] + " ");
        }
        for(int i=0; i<array1.length; i++){
            if(array1[i]%2!=0)array1[i]=0;
            System.out.println(array1[i] + " ");
        }
    }

    public static void ex3(String[] args) {
        int[] array2 = new int[4];

        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.random() * 90 + 10);
            System.out.print(array2[i] + " ");
        }

        for (int i = 0; i < array2.length; i++) {
            if (i > 0) {
                if (array2[i - 1] >= array2[i]) {
                    System.out.println("Послідовність зростає");
                    break;
                }
            }
            if (i == array2.length - 1 ) {
                System.out.println("Послідовність не зростає" );
            }
        }
    }
    public static void ex4(String[] args) {
        double sumArray3 = 0, sumArray4 = 0;
        int[] array3 = new int[5];
        for (int i = 0; i < array3.length; i++) {
            array3[i] = (int) (Math.random() * 6);
            System.out.print(array3[i] + " ");
            sumArray3 += (double) array3[i] / array3.length;
        }
        System.out.println(" ");
        int[] array4 = new int[5];
        for (int i = 0; i < array4.length; i++) {
            array4[i] = (int) (Math.random() * 6);
            System.out.print(array4[i] + " ");
            sumArray4 += (double) array4[i] / array4.length;
        }
        System.out.println(" ");
        if (sumArray3 == sumArray4)
            System.out.println("Середнє арифметичне значення двох масивів рівні");
        else {
            if (sumArray3 > sumArray4)
                System.out.println("Середнє арифметичне значення першого масива більше");
            else System.out.println("Середнє арифметичне значення другого масива більше");
        }
    }
}