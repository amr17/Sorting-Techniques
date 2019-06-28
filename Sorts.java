
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
public class Sorts extends MergeSort {

    public static double[] doSelectionSort(double[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }

            double smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        return arr;
    }

    static double[] bubbleSort(double[] arr) {
        int n = arr.length;
        double temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    //swap elements  
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        return arr;
    }
    
    public static double[] insertionSort(double array[]) {  
        int n = array.length;  
        for (int j = 1; j < n; j++) {  
            double key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;  
        }  
       return array;
    } } 
// public static void print( double[] arr, int n){
//
//    for (int i=0; i<n; i++)
//            System.out.print(arr[i]+" ");
//        System.out.println();
//    
//          }
//public static void main(String args[])
//    { Scanner s = new Scanner(System.in);
//        int n= s.nextInt();
//     double[] arr = new double[n]; 
//         double[] ar = new double[n];
//     for(int i=0; i<n;i++)
//            arr[i]= s.nextDouble();   
//     insertionSort(arr);
//            print(arr,n);
//    }}
    
