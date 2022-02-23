package com.estafet.learning.US007;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task7 {
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
        int[][] intArr = {
                            {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                            {11, 12, 13, 14, 15, 16, 17, 18, 19, 20}
        };

        System.out.println("\n------------------------");
        System.out.println("Array length is: " + intArr.length);
        int sum = 0;
        for (int[] ints : intArr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
                sum += anInt;
            }
        }

        int firstElement = intArr[0][0];
        int[] lastRow = intArr[intArr.length - 1];
        int lastElement = lastRow[lastRow.length - 1];
        System.out.print("\nFirst element of array is : " + firstElement);
        System.out.print("\nValue of thirteen element of array is : " + intArr[1][2]);
        System.out.print("\nLast element of array is : " + lastElement);
        System.out.print("\nSum of array elements is : " + sum);
    }

    private static void swapArrayElements() {
        int[][] intArr = new int[10][10];
        intArr[0][0] = 1;
        intArr[1][0] = 2;
        int a = intArr[0][0];
        int b = intArr[1][0];
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
        String[][] stringArr = {
                {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"},
                {"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty"}
        };

        System.out.println("\n------------------------");
        System.out.println("Array length is: " + stringArr.length);

        for (String[] strings : stringArr) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
        }

        String first = stringArr[0][0];
        String[] lastRow = stringArr[stringArr.length - 1];
        String lastElement = lastRow[lastRow.length - 1];

        System.out.print("\nFirst element of array is : " + first);
        System.out.print("\nLast element of array is : " + lastElement);
        System.out.println("\n------------------------");
    }

    private static void getAverageOfArray() {
        int[][] intArr = {
                {1, 2, 3},
                {11, 12, 13}
        };

        double total = 0;
        for (int[] ints : intArr) {
            for (int anInt : ints) {
                total += anInt;
            }
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
        int[][] arr = new int[][]{
                {5, 1, 2, 3, 4, 2, 7, 8, 8, 3, 5},
                {5, 1, 2, 3, 5, 2, 7, 8, 7, 3, 2}
        };
        System.out.println("\n------------------------");
        System.out.println("\nDuplicate elements in the given array: ");

        Set<Integer> uniqueNumbers = new HashSet<>();
        Set<Integer> duplicateNumbers = Arrays.stream(arr)
                .flatMapToInt(IntStream::of)
                .filter(v -> !uniqueNumbers.add(v))
                .boxed()
                .collect(Collectors.toSet());

        System.out.println("Duplicate numbers are : " +duplicateNumbers);
    }

    static void bubbleSort(int[][] ints)
    {
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                for (int k = 0; k < ints[i].length - j - 1; k++) {
                    if (ints[i][k] > ints[i][k + 1]) {
                        int t = ints[i][k];
                        ints[i][k] = ints[i][k + 1];
                        ints[i][k + 1] = t;
                    }
                }
            }
        }

        for (int[] anInt : ints) {
            for (int i : anInt) System.out.print(i + " ");
        }
    }

    private static void bubbleSortExample() {
            int[][] unsortedArray = {
                    { 7, 3, 0, 2 },
                    { 9, 5, 3, 2 }
            };

        System.out.println("Unsorted Array ");
        System.out.println(Arrays.deepToString(unsortedArray));
        System.out.println("Sorted Array in Ascending Order wit Bubble sort algorithm:");
        bubbleSort(unsortedArray);
        System.out.println("\n------------------------");
    }
}
