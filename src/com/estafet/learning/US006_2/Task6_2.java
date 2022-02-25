package com.estafet.learning.US006_2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task6_2 {
    public static void main(String[] args) {
        intArray();
        swapArrayElements();
        stringArray();
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
        System.out.print("\nRows length is: " + intArr.length);
        System.out.print("\nColumns length is: " + intArr[0].length);
        System.out.print("\nFirst element of array is : " + firstElement);
        System.out.print("\nValue of thirteen element of array is : " + intArr[1][2]);
        System.out.print("\nLast element of array is : " + lastElement);
        System.out.print("\nSum of array elements is : " + sum);
        System.out.print("\n------------------------");
    }

    private static void swapArrayElements() {
        int[][] intArr = new int[10][10];
        intArr[0][0] = 1;
        intArr[1][0] = 2;
        int a = intArr[0][0];
        int b = intArr[1][0];
        System.out.print("\nValue of first element is : " + a);
        System.out.print("\nValue of second element is : " + b);
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.print("\nSwapped value of first element is : " + a);
        System.out.print("\nSwapped value of second element is : " + b);
        System.out.print("\n------------------------");
    }

    private static void stringArray() {
        String[][] stringArr = {
                {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"},
                {"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty"}
        };

        for (String[] strings : stringArr) {
            for (String string : strings) {
                System.out.print("\nPrinted array elements are : "+string);
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

        System.out.print("\nGet Average of Array");
        System.out.print("\nThe total is: " + total + "%n");
        double average = total / intArr.length;
        System.out.format("The average is: " + average + "%n");
        System.out.print("\n------------------------");
    }

    private static void copyElementsOfArray() {
        int[] a = {1, 4, 8};
        int[] b;
        b = Arrays.copyOf(a, 3);

        System.out.print("\nElements of Array a are: %n");
        for (int j : a) System.out.print(j + " ");

        System.out.format("%nElements of Array b are:  %n");
        for (int j : b) System.out.print(j + " ");
        System.out.println("\n------------------------");
    }

    private static void getMinAndMaxOfArray() {
        int[][] a = {
                {13, 43243, 8, 321321312, 43423, -1},
                {0, 443, 8, 54551, 43423, -10}
        };

        System.out.print("\nPrinted array is : "+Arrays.deepToString(a));
        System.out.print("\nMin value of Array is : " + getMinValue(a));
        System.out.print("\nMax value of Array is : " + getMaxValue(a));
    }
    public static int getMaxValue(int[][] numbers) {
        int maxValue = numbers[0][0];
        for (int[] number : numbers) {
            for (int j : number) {
                if (j > maxValue) {
                    maxValue = j;
                }
            }
        }
        return maxValue;
    }

    public static int getMinValue(int[][] numbers) {
        int minValue = numbers[0][0];
        for (int[] number : numbers) {
            for (int j : number) {
                if (j < minValue) {
                    minValue = j;
                }
            }
        }
        return minValue ;
    }


    private static void addValueInArray() {
        int x = 50;
        int[][] arr = {
                {13, 43243, 8, 321321312, 43423, -1},
                {0, 443, 8, 54551, 43423, -10}
        };

        System.out.print("\n------------------------");
        System.out.print("\nInitial Array:\n" + Arrays.deepToString(arr));
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[0].length; j++)
            {
                arr[1][2] = x;
            }
        }
        System.out.print("\nArray with " + x + " added:\n" + Arrays.deepToString(arr));
        System.out.print("\n------------------------");
    }

    private static void findDuplicateValuesOfArray() {
        int[][] arr = new int[][]{
                {5, 1, 2, 3, 4, 2, 7, 8, 8, 3, 5},
                {5, 1, 2, 3, 5, 2, 7, 8, 7, 3, 2}
        };
        System.out.print("\n------------------------");
        System.out.print("\nDuplicate elements in the given array: ");
        System.out.print("\n"+Arrays.deepToString(arr));
        Set<Integer> uniqueNumbers = new HashSet<>();
        Set<Integer> duplicateNumbers = Arrays.stream(arr)
                .flatMapToInt(IntStream::of)
                .filter(v -> !uniqueNumbers.add(v))
                .boxed()
                .collect(Collectors.toSet());

        System.out.print("\nDuplicate numbers are : \n" +duplicateNumbers);
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
            for (int i : anInt) System.out.print(i+" ");
        }
    }

    private static void bubbleSortExample() {
            int[][] unsortedArray = {
                    { 7, 3, 0, 2 },
                    { 9, 5, 3, 2 }
            };

        System.out.print("\nUnsorted Array:");
        System.out.print("\n"+Arrays.deepToString(unsortedArray));
        System.out.print("\nSorted Array in Ascending Order with Bubble sort algorithm: \n");
        bubbleSort(unsortedArray);
        System.out.println("\n------------------------");
    }
}
