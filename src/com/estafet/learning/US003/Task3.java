package com.estafet.learning.US003;

public class Task3 {
    public static void main(String[] args) {
        byte b = 100;
        short s = 10000;
        int i = 100000;
        long l = 321312312;
        float f = 3213.32f;
        double d = 23123;
        char capitalC = 'C';
        boolean result = true;
        Byte.toString(b);
        Short.toString(s);
        Float.toString(f);

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(capitalC);
        System.out.println(result);

        Long long1 = new Long((long) f);
        Long long2 =Long.valueOf((long) f);
        Long long3 = (long) f;
        System.out.println("First converted to long: " + long1);
        System.out.println("Second converted to long: " + long2);
        System.out.println("Third converted to long: " + long3);
    }
}
