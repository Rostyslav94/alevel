package com.dubyna;

public class Main {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 999);
        int b = (int) (Math.random() * 999);
        int c = (int) (Math.random() * 999);
        int min = a < b ? a : b;
        min = c < min ? c : min;
        System.out.println(Math.abs(min) + " ");
    }
}