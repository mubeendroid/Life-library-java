/* 
 * Life library
 * Copyright (c) Mubeen Ul Alam
 * 
 * https://www.mubeendroid.com
 */

package com.mubeendroid;

import java.util.Arrays;

public class Sorting {

    public <T extends Comparable<T>> T[] bubbleSort(T arr[]) {
        T temp;
        for (int i = 0; i < arr.length; i++) {
            int flag = 0;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = 1;
                }
            }
            if (flag == 0) {
                break;
            }
        }
        return arr;
    }

    public <T extends Comparable<T>> T[] insertionSort(T arr[]) {
        for (int i = 1; i < arr.length; i++) {
            T key = arr[i];
            int j = i - 1;
            while (j > -1 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

    public <T extends Comparable<T>> T[] selectionSort(T arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[index]) < 0) {
                    index = j;
                }
            }
            T smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        return arr;
    }

    public <T extends Comparable<T>> void merge(T arr[], int beg, int mid, int end) {
        int l = mid - beg + 1;
        int r = end - mid;
        T[] LeftArray = newArray(l);
        T RightArray[] = newArray(r);
        for (int i = 0; i < l; ++i) {
            LeftArray[i] = arr[beg + i];
        }
        for (int j = 0; j < r; ++j) {
            RightArray[j] = arr[mid + 1 + j];
        }
        int i = 0, j = 0;
        int k = beg;
        while (i < l && j < r) {
            if (LeftArray[i].compareTo(RightArray[j]) <= 0) {
                arr[k] = LeftArray[i];
                i++;
            } else {
                arr[k] = RightArray[j];
                j++;
            }
            k++;
        }
        while (i < l) {
            arr[k] = LeftArray[i];
            i++;
            k++;
        }
        while (j < r) {
            arr[k] = RightArray[j];
            j++;
            k++;
        }
    }

    @SafeVarargs
    static <E> E[] newArray(int length, E... array) {
        return Arrays.copyOf(array, length);
    }

    public <T extends Comparable<T>> T[] sortForMerge(T arr[], int beg, int end) {
        if (beg < end) {
            int mid = (beg + end) / 2;
            sortForMerge(arr, beg, mid);
            sortForMerge(arr, mid + 1, end);
            merge(arr, beg, mid, end);
        }
        return arr;
    }

    public <T extends Comparable<T>> T[] mergeSort(T arr[]) {
        return sortForMerge(arr, 0, arr.length - 1);
    }

    public <T extends Comparable<T>> int partition(T a[], int beg, int end) {
        int left, right, loc, flag;
        T temp;
        loc = left = beg;
        right = end;
        flag = 0;
        while (flag != 1) {
            while ((a[loc].compareTo(a[right]) <= 0) && (loc != right)) {
                right--;
            }
            if (loc == right) {
                flag = 1;
            } else if (a[loc].compareTo(a[right]) > 0) {
                temp = a[loc];
                a[loc] = a[right];
                a[right] = temp;
                loc = right;
            }
            if (flag != 1) {
                while ((a[loc].compareTo(a[left]) >= 0) && (loc != left)) {
                    left++;
                }
                if (loc == left) {
                    flag = 1;
                } else if (a[loc].compareTo(a[left]) < 0) {
                    temp = a[loc];
                    a[loc] = a[left];
                    a[left] = temp;
                    loc = left;
                }
            }
        }
        return loc;
    }

    public <T extends Comparable<T>> T[] sortForQuick(T a[], int beg, int end) {
        int loc;
        if (beg < end) {
            loc = partition(a, beg, end);
            sortForQuick(a, beg, loc - 1);
            sortForQuick(a, loc + 1, end);
        }
        return a;
    }

    public <T extends Comparable<T>> T[] quickSort(T arr[]) {
        return sortForQuick(arr, 0, arr.length - 1);
    }

    public <T extends Comparable<T>> void heapify(T[] arr, int size, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        T temp;
        if (left < size && arr[left].compareTo(arr[largest]) > 0) {
            largest = left;
        }
        if (right < size && arr[right].compareTo(arr[largest]) > 0) {
            largest = right;
        }
        if (largest != i) {
            temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, size, largest);
        }
    }

    public <T extends Comparable<T>> T[] sortForHeap(T[] arr, int size) {
        int i;
        T temp;
        for (i = size / 2 - 1; i >= 0; i--) {
            heapify(arr, size, i);
        }
        for (i = size - 1; i >= 0; i--) {
            temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
        return arr;
    }

    public <T extends Comparable<T>> T[] heapSort(T arr[]) {
        return sortForHeap(arr, arr.length);
    }
}
