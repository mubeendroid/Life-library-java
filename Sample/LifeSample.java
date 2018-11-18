package com.mubeendroid;

import java.util.Random;

public class LifeSample {

    public static void main(String[] args) {
    	
        Life life = new Life();
        Random rand = new Random();

        //Initialing arrays
        int[] integerArray = new int[100];
        float[] floatArray = new float[100];
        double[] doubleArray = new double[100];
        Integer[] sortIntegerArray = new Integer[100];
        Float[] sortFloatArray = new Float[100];
        Double[] sortDoubleArray = new Double[100];
        String[] sortStringArray = new String[100];

        //Generating random numbers to fill the arrays
        for (int i = 0; i < 100; i++) {
            integerArray[i] = rand.nextInt(100000 - 0) + 0;
            sortIntegerArray[i] = rand.nextInt(100000 - 0) + 0;
            double randomDouble = 0.0 + (100000.0 - 0.0) * rand.nextDouble();
            doubleArray[i] = randomDouble;
            sortDoubleArray[i] = randomDouble;
            float randomFloat = (float) (0.0 + (100000.0 - 0.0) * rand.nextFloat());
            floatArray[i] = randomFloat;
            sortFloatArray[i] = randomFloat;
            byte[] randomString = new byte[10];
            new Random().nextBytes(randomString);
            sortStringArray[i] = randomString.toString();
        }

        //Sum of the elements of array
        int sumOfIntegerArray = life.sumOfArray(integerArray);
        float sumOfFloatArray = life.sumOfArray(floatArray);
        double sumOfDoubleArray = life.sumOfArray(doubleArray);

        //Check if a number is prime
        boolean isPrime = life.checkPrime(5);

        //Check if a number is even or odd
        int isEven = life.checkEvenOdd(4);  //returns 0 if the given number is even, otherwise returns 1.

        //Reverse an integer 
        int reverseNumber = life.reverseNumber(12345);

        //Calculate area of circle
        double areaOfCircle = life.areaOfCircle(12.34);

        //Calculate area of rectangle
        double areaOfRectangle = life.areaOfRectangle(10, 20);

        //Calculate factorial of a number
        int getFactorial = life.getFactorial(10);

        //Take screenshot. First parameter is image name and second parameter is image type.
        life.takeScreenshot("image1", "jpg");
        
        /*Search for an element in array. If the number is found in the array then 
        returns index of that number. Otherwise returns 0.*/
        int searchIndex=life.binarySearch(integerArray, 10);

        /*Sorting array. You have to give Integer, Double, Float, String as parameter instead of
        giving int, double and float.*/
        //Bubble sort
        sortIntegerArray = life.bubbleSort(sortIntegerArray);
        sortFloatArray = life.bubbleSort(sortFloatArray);
        sortDoubleArray = life.bubbleSort(sortDoubleArray);
        sortStringArray = life.bubbleSort(sortStringArray);

        //Insertion sort
        sortIntegerArray = life.insertionSort(sortIntegerArray);
        sortFloatArray = life.insertionSort(sortFloatArray);
        sortDoubleArray = life.insertionSort(sortDoubleArray);
        sortStringArray = life.insertionSort(sortStringArray);

        //Selection sort
        sortIntegerArray = life.selectionSort(sortIntegerArray);
        sortFloatArray = life.selectionSort(sortFloatArray);
        sortDoubleArray = life.selectionSort(sortDoubleArray);
        sortStringArray = life.selectionSort(sortStringArray);

        //Merge sort
        sortIntegerArray = life.mergeSort(sortIntegerArray);
        sortFloatArray = life.mergeSort(sortFloatArray);
        sortDoubleArray = life.mergeSort(sortDoubleArray);
        sortStringArray = life.mergeSort(sortStringArray);

        //Quick sort
        sortIntegerArray = life.quickSort(sortIntegerArray);
        sortFloatArray = life.quickSort(sortFloatArray);
        sortDoubleArray = life.quickSort(sortDoubleArray);
        sortStringArray = life.quickSort(sortStringArray);

        //Heap sort
        sortIntegerArray = life.heapSort(sortIntegerArray);
        sortFloatArray = life.heapSort(sortFloatArray);
        sortDoubleArray = life.heapSort(sortDoubleArray);
        sortStringArray = life.heapSort(sortStringArray);
    }
}
