package com.estafet.learning.US006;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.IntStream;
import java.util.Set;

public class Task6 {
    public static void main(String[] args) {
        intArray();
        stringArray();
        swapArrayElements();
        getAverageOfArray();
        copyElementsOfArray();
        getMinAndMaxOfArray();
        findDuplicateValuesOfArray();
        addValueInArray();
        bubbleSortExample();
    }

    static float[] floatArr;

    private static void intArray() {
        floatArr = new float[10];
        int[] intArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("\n------------------------");
        System.out.println("Array length is: " + intArr.length);
        for (int j : intArr) {
            System.out.print(j + " ");
        }
        int first = intArr[0];
        int last = intArr[intArr.length - 1];
        System.out.print("\nFirst element of array is : " + first);
        System.out.print("\nValue of third element of array is : " + intArr[2]);
        System.out.print("\nLast element of array is : " + last);
        int sum = IntStream.of(intArr).sum();
        System.out.print("\nSum of array elements is : " + sum);
    }

    private static void swapArrayElements() {
        int[] intArr = new int[10];
        intArr[0] = 1;
        intArr[1] = 2;
        int a = intArr[0];
        int b = intArr[1];
        System.out.format("Value of first element is : " + a + "%n");
        System.out.format("Value of second element is : " + b + "%n");
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.format("Swapped value of first element is : " + a + "%n");
        System.out.format("Swapped value of second element is : " + b + "%n");
        System.out.println("\n------------------------");
    }

    private static void stringArray() {
        String[] stringArr = {"first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth"};

        System.out.println("\n------------------------");
        System.out.println("Array length is: " + stringArr.length);
        for (String s : stringArr) {
            System.out.print(s + " ");
        }
        String first = stringArr[0];
        String last = stringArr[stringArr.length - 1];
        System.out.print("\nFirst element of array is : " + first);
        System.out.print("\nLast element of array is : " + last);
        System.out.println("\n------------------------");
    }

    private static void getAverageOfArray() {
        int[] intArr = new int[3];
        intArr[0] = 11;
        intArr[1] = 66;
        intArr[2] = 5;

        double total = 0;
        for (int i : intArr) {
            total = total + i;
        }

        System.out.println("\nGet Average of Array:");
        System.out.format("The total is: " + total + "%n");
        double average = total / intArr.length;
        System.out.format("The average is: " + average + "%n");
        System.out.println("\n------------------------");
    }

    private static void copyElementsOfArray() {
        int[] a = {1, 4, 8};
        int[] b;
        b = Arrays.copyOf(a, 3);

        System.out.format("Elements of Array a are: %n");
        for (int j : a) System.out.print(j + " ");

        System.out.format("%nElements of Array b are:  %n");
        for (int j : b) System.out.print(j + " ");
        System.out.println("\n------------------------");
    }

    private static void getMinAndMaxOfArray() {
        int[] a = {13, 43243, 8, 321321312, 43423, -1};
        Arrays.sort(a);
        System.out.print("\nMin value of Array is : " + a[0]);
        System.out.print("\nMax value of Array is : " + a[a.length - 1]);
    }

    public static int[] addElement(int n, int[] arr, int x, int pos) {
        int[] newArray = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            if (i < pos - 1) newArray[i] = arr[i];
            else if (i == pos - 1) newArray[i] = x;
            else newArray[i] = arr[i - 1];
        }
        return newArray;
    }

    private static void addValueInArray() {
        int n = 10;
        int x = 50;

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("\n------------------------");
        System.out.println("\nInitial Array:\n" + Arrays.toString(arr));

        arr = addElement(n, arr, x, 5);
        System.out.println("\nArray with " + x + " added:\n" + Arrays.toString(arr));
        System.out.println("\n------------------------");
    }

    private static void findDuplicateValuesOfArray() {
        int[] arr = new int[]{5, 1, 2, 3, 4, 2, 7, 8, 8, 3, 5};
        System.out.println("\n------------------------");
        System.out.println("\nDuplicate elements in the given array: ");

        Set<Integer> integers = new HashSet<>();
        for (int i : arr) {
            if (!integers.add(i)) {
                System.out.println("Duplicate element is :" + i);
            }
        }
    }

    private static void bubbleSort(int[] array) {
        int size = array.length;

        for (int i = 0; i < size - 1; i++)
            for (int j = 0; j < size - i - 1; j++)
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
    }

    private static void bubbleSortExample() {
        int[] unsortedArray = {-2, 45, 0, 11, -9, 3213, 4, -3, -4, 2, 20, 5, 100, -1};

        System.out.println("Unsorted Array ");
        System.out.println(Arrays.toString(unsortedArray));

        bubbleSort(unsortedArray);

        System.out.println("Sorted Array in Ascending Order wit Bubble sort algorithm:");
        System.out.println(Arrays.toString(unsortedArray));
        System.out.println("\n------------------------");
    }
}
