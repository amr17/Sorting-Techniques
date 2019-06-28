
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Reyad
 */
public class mainn {

    public static long dss;
    public static long tmh;
    public static long tqs;
    public static long tms;
    public static long tis;
    public static long bs;

    public static void print(double[] arr, int n) {

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println();
    }

    public static void main(String args[]) {
        long t;
        long t1;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of integer elements");
        int n = s.nextInt();
        double[] arr = new double[n];
        double[] ar = new double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Math.random() * 1000;
           //    arr[i]= s.nextDouble();   

        }

        ar = arr;
        print(arr, 10);

        t = System.currentTimeMillis();
        QuickSort.quickSort(arr, 0, n - 1);
        t1 = System.currentTimeMillis();
        tqs = (t1 - t) * 1000;
        print(arr, n);
        System.out.println("QuickSort       TIME TAKEN: " + tqs);
        arr = ar;

        t = System.currentTimeMillis();
        MergeSort.mergesort(arr, 0, arr.length - 1);
        t1 = System.currentTimeMillis();
        tms = (t1 - t) * 1000;
        print(arr, n);
        System.out.println("mergesort      TIME TAKEN: " + tms);
        arr = ar;

        t = System.currentTimeMillis();
        //heaaaap.heap(arr);
        MaxHeap.heapify(arr);
        t1 = System.currentTimeMillis();
        tmh = (t1 - t) * 1000;
        print(arr, n);
        System.out.println("Heapify     TIME TAKEN: " + tmh);
        arr = ar;

        t = System.currentTimeMillis();
        Sorts.insertionSort(arr);
        t1 = System.currentTimeMillis();
        tis = (t1 - t) * 1000;
        print(arr, n);
        System.out.println("insertionSort      TIME TAKEN: " + tis);
        arr = ar;

        t = System.currentTimeMillis();
        Sorts.doSelectionSort(arr);
        t1 = System.currentTimeMillis();
        dss = (t1 - t) * 1000;
        print(arr, n);
        System.out.println("doSelectionSort       TIME TAKEN: " + dss);
        arr = ar;

        t = System.currentTimeMillis();
        Sorts.bubbleSort(arr);
        t1 = System.currentTimeMillis();
        bs = (t1 - t) * 1000;
        print(arr, n);
        System.out.println("bubbleSort        TIME TAKEN: " + bs);
        arr = ar;

    }
}
