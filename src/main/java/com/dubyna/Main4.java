package com.dubyna;
public class Main4 {
    public static void main(String[] args) {
        String str = "Hello World!";
        char c = str.charAt(1 - 1);
        char b = str.charAt(12 - 1);
        System.out.println(c);
        System.out.println(b);
    }



    public static void ex(String[] args) {
        String str = "Java Exercises";
        String str1 = "Java Exercise";
        System.out.println(str.endsWith("se"));
        System.out.println(str1.endsWith("se"));
    }


              public static void ex3 (String[] args) {
                   String full = "Stephen Edwin King";
                     String one = "Walter Winchell";
                     String two = "Edwin";

                       System.out.println(full.contains(one));
                       System.out.println(full.contains(two));
        }


             public static void ex4(String[] args) {
        String str = "Stephen Edwin King";
        System.out.println("Walter Winchell".equalsIgnoreCase(str));
        System.out.println("stephen edwin king".equalsIgnoreCase(str));
        }


public static void ex5(String[] args) {
        String str1 = "Red is favorite color";
        String str2 = "Orange is also my favorite color";
        System.out.println(str1.startsWith("Red"));
        System.out.println(str2.startsWith("Red"));
        }
        }

