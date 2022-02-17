package com.estafet.learning.US004;

public class Task4 {
    public static void main(String[] args) {
        findPerimeter();
        findSquare();
        incrementValues();
        decrementValues();
        booleanStatementLogicalOperators();
    }

    public static void findPerimeter() {
        int sideA = 3;
        int sideB = 4;
        int sideC = 5;
        int Perimeter = sideA + sideB + sideC;
        System.out.println("Perimeter of triangle is: " + Perimeter);
    }

    public static void findSquare() {
        int sideC = 3;
        int sideHC= 4;
        int Square = (sideC*sideHC)/2;
        System.out.println("Square of triangle is: " + Square);
    }

    public static void incrementValues(){
        int a = 5;
        System.out.println(a++);
        System.out.println(++a);
    }
    public static void decrementValues(){
        int a = 5;
        System.out.println(a--);
        System.out.println(--a);
    }

    public static void booleanStatementLogicalOperators(){
        System.out.format("+-------+------+--------+---------+-------+%n");
        System.out.format("|   X   |   Y  | X OR Y | X AND Y | NOT X |%n");
        System.out.format("+-------+------+--------+---------+-------+%n");
        System.out.format("|  true | true |  true  |   true  | false |%n");
        System.out.format("+-------+------+--------+---------+-------+%n");
        System.out.format("|  true |false |  true  |  false  | false |%n");
        System.out.format("+-------+------+--------+---------+-------+%n");
        System.out.format("| false | true |  true  |  false  | true  |%n");
        System.out.format("+-------+------+--------+---------+-------+%n");
        System.out.format("| false |false | false  |  false  | true  |%n");
        System.out.format("+-------+------+--------+---------+-------+%n");
    }
}
