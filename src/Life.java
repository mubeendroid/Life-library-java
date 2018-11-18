/* 
 * Life library
 * Copyright (c) Mubeen Ul Alam
 * 
 * https://www.mubeendroid.com
 */

package com.mubeendroid;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Life {

    public int sumOfArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public double sumOfArray(double[] arr) {
        double sum = 0.0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public float sumOfArray(float[] arr) {
        float sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public int checkPrime(int a) {
        int i, flag = 0;
        for (i = 2; i < a / 2; i++) {
            if (a % i == 0) {
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public int checkEvenOdd(int b) {
        if (b % 2 == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public int reverseNumber(int n) {
        int reversedNumber = 0, remainder;
        while (n != 0) {
            remainder = n % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            n /= 10;
        }
        return reversedNumber;
    }

    public double areaOfCircle(double radius) {
        return 3.1416 * radius * radius;
    }

    public double areaOfRectangle(double length, double breadth) {
        return length * breadth;
    }

    public int getFactorial(int num) {
        int i = 1, f = 1;
        while (i <= num) {
            f = f * i;
            i++;
        }
        return f;
    }

    public void takeScreenshot(String imageName, String format) {
        Rectangle screenRect;
        BufferedImage screenFullImage = null;
        try {
            Robot robot = new Robot();
            screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            screenFullImage = robot.createScreenCapture(screenRect);
            ImageIO.write(screenFullImage, format, new File(imageName + "." + format));
        } catch (AWTException | IOException ex) {

        }
    }

    public <T extends Comparable<T>> T[] bubbleSort(T arr[]) {
        Sorting ob = new Sorting();
        arr = ob.bubbleSort(arr);
        return arr;
    }

    public <T extends Comparable<T>> T[] insertionSort(T arr[]) {
        Sorting ob = new Sorting();
        arr = ob.insertionSort(arr);
        return arr;
    }

    public <T extends Comparable<T>> T[] selectionSort(T arr[]) {
        Sorting ob = new Sorting();
        arr = ob.selectionSort(arr);
        return arr;
    }

    public <T extends Comparable<T>> T[] mergeSort(T arr[]) {
        Sorting ob = new Sorting();
        arr = ob.mergeSort(arr);
        return arr;
    }

    public <T extends Comparable<T>> T[] quickSort(T arr[]) {
        Sorting ob = new Sorting();
        arr = ob.quickSort(arr);
        return arr;
    }

    public <T extends Comparable<T>> T[] heapSort(T arr[]) {
        Sorting ob = new Sorting();
        arr = ob.heapSort(arr);
        return arr;
    }

    public int searchForBinary(int[] a, int beg, int end, int item) {
        int mid;
        if (end >= beg) {
            mid = (beg + end) / 2;
            if (a[mid] == item) {
                return mid;
            } else if (a[mid] < item) {
                return searchForBinary(a, mid + 1, end, item);
            } else {
                return searchForBinary(a, beg, mid - 1, item);
            }

        }
        return -1;
    }

    public int binarySearch(int arr[], int number) {
        return searchForBinary(arr, 0, arr.length - 1, number);
    }
}
