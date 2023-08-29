package com.kraaken.project.Task1;

import java.lang.reflect.Array;

public class Main {
    public static void task1() {
        System.out.println("1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.");

        int k = 2;
        int[] a = new int[10];
        int sum = 0;





        for (int i = 0; i < a.length; i++) {
            if (a[i] % k == 0) {
                sum += a[i];
            }
        }

        System.out.println("Сумма элементов, которые кратны " + k + ", равна " + sum);
        System.out.println();
    }


    public static void main(String[] args) {
        task1();
    }
}



