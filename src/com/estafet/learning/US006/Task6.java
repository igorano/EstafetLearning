package com.estafet.learning.US006;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Task6 {
    public static void main(String[] args) {
        intArray();
        stringArray();
        swapArrayElements();
        getAverageOfArray();
        copyElementsOfArray();
        getMinAndMaxOfArray();
        addValueInArray();
        findDuplicateValuesOfArray();

        int[] data = { -2, 45, 0, 11, -9, 3213, 4, -3, -4, 2, 20, 5, 100, -1 };

        System.out.println("Unsorted Array ");
        System.out.println(Arrays.toString(data));

        bubbleSort(data);
        System.out.println("Sorted Array in Ascending Order wit Bubble sort algorithm:");
        System.out.println(Arrays.toString(data));
    }
    static int[] intArr;
    long[] longArr;
    static String[] stringArr;
    byte[] byteArr;

    private static void intArray(){
        intArr = new int[10];
        intArr[0]= 1;
        intArr[1]= 2;
        intArr[2]= 3;
        intArr[3]= 4;
        intArr[4]= 5;
        intArr[5]= 6;
        intArr[6]= 7;
        intArr[7]= 8;
        intArr[8]= 9;
        intArr[9]= 10;


        System.out.println(intArr.length);
        for (int i = 0; i <= 9; i++) {
            System.out.println(intArr[i]);
        }
        int first = intArr[0];
        int last = intArr[intArr.length-1];
        System.out.format("First element of array is : "+first+"%n");
        System.out.format("Value of third element of array is : " + intArr[2] + "%n");
        System.out.format("Last element of array is : " +last+"%n");
        int sum = IntStream.of(intArr).sum();
        System.out.format("Sum of array elements is : "+ sum+"%n");
     }
     private static void swapArrayElements(){
         intArr = new int[10];
         intArr[0]= 1;
         intArr[1]= 2;
         int a = intArr[0];
         int b = intArr[1];

         System.out.format("Value of first element is : "+a+"%n");
         System.out.format("Value of second element is : "+b+"%n");
         a ^= b;
         b ^= a;
         a ^= b;
         System.out.format("Swapped value of first element is : " +a+"%n");
         System.out.format("Swapped value of second element is : " +b+"%n");
     }

    private static void stringArray(){
        stringArr = new String[10];
        stringArr[0]= "first";
        stringArr[1]= "second";
        stringArr[2]= "third";
        stringArr[3]= "fourth";
        stringArr[4]= "fifth";
        stringArr[5]= "sixth";
        stringArr[6]= "seventh";
        stringArr[7]= "eight";
        stringArr[8]= "ninth";
        stringArr[9]= "tenth";


        System.out.println(stringArr.length);
        for (int i = 0; i <= 9; i++) {
            System.out.println(stringArr[i]);
        }
        String first = stringArr[0];
        String last = stringArr[stringArr.length-1];
        System.out.format("First element of array is : "+first+"%n");
        System.out.format("Last element of array is : " +last+"%n");
    }

    private static void getAverageOfArray(){
        intArr = new int[3];
        intArr[0]= 11;
        intArr[1]= 66;
        intArr[2]= 5;
        double total = 0;

        for (int i : intArr) {
            total = total + i;
        }
        System.out.format("The total is: "+total+"%n");
        double average = total / intArr.length;
        System.out.format("The average is: "+average+"%n");
    }

    private static void copyElementsOfArray(){
        int[] a = { 1, 4, 8 };
        int[] b;
        b = Arrays.copyOf(a, 3);

        System.out.format("Elements of Array a are: %n");
        for (int j : a) System.out.print(j + " ");

        System.out.format("%nElements of Array b are:  %n");
        for (int j : b) System.out.print(j + " ");
    }

    private static void getMinAndMaxOfArray(){
        int[] a = { 13, 43243, 8,321321312,43423 ,-1 };
        Arrays.sort(a);

        System.out.print("\nMin value of Array is : " + a[0]);
        System.out.print("\nMax value of Array is : " + a[a.length-1]);
    }

    private static void addValueInArray(){
        int x = 50;
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };


        // print the updated array
        System.out.println("\nArray with " + x
                + " added:\n"
                + Arrays.toString(arr));
    }

    private static void findDuplicateValuesOfArray(){
        int [] arr = new int [] {5, 1, 2, 3, 4, 2, 7, 8, 8, 3, 5};

        System.out.println("\nDuplicate elements in the given array: ");
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j])
                    System.out.println(arr[j]);
            }
        }
    }

    static void bubbleSort(int[] array) {
        int size = array.length;

        for (int i = 0; i < size - 1; i++)
            for (int j = 0; j < size - i - 1; j++)
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
    }
}
