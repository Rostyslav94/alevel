package com.dubyna;




public class Main2 {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 999);
        int b = (int) (Math.random() * 999);
        int c = (int) (Math.random() * 999);
        if (a + b >= c && b + c >= a && a + c >= b) {
            int p = (a + b + c) / 2;
            double s = (p * (p - a) * (p - b) * (p - c)) * 0.5;
            System.out.println(s + " ");
        } else {
            System.out.println("Треугольник не существует");
        }
    }
    }
