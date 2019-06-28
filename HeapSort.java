import java.util.Scanner;

public class HeapSort 
{
      
            
public static void BuildMaxHeap( double[] arr)
{
    for( int i = (int)Math.floor(arr.length - 1 ); i >= 0; i-- )
        MaxHeapify( arr, i );
}

public static void BuildMaxHeapy( double[ ] arr,int j )
{
    for( int i = (int)Math.floor( arr.length - 1 ); i >= 0; i-- )
        MaxHeapify( arr, i );
}

public static void MaxHeapify( double[ ] arr, int i )
{
    int left = 2 * i + 1;
    int right = 2 * i + 2;
    int largest = i;

    if( left < arr.length && arr[ left ] > arr[ largest ] )
        largest = left;
    if( right < arr.length && arr[ right ] > arr[ largest ] )
        largest = right;
    if( largest != i )
    {
        double temp = arr[ i ];
        arr[ i ] = arr[ largest ];
        arr[ largest ] = temp;
        MaxHeapify( arr, largest );
    }

}


public static void HEAPSORTY( double[] arr, int n){
     double[] ar = new double[n]; 
     for(int j=0;j<n;j++){
    double temp= arr[0];
    arr[0]=arr[n-j-1];
    ar[n-j-1]=temp;
    BuildMaxHeapy(arr,j);
    }
            print(ar,n);
}
public static void print( double[] arr, int n){

    for (int i=0; i<n; i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    
          }
//public static void main(String args[])
//    { Scanner s = new Scanner(System.in);
//        int n= s.nextInt();
//     double[] arr = new double[n]; 
//         double[] ar = new double[n];
//     for(int i=0; i<n;i++)
//            arr[i]= s.nextDouble();
//            BuildMaxHeap(arr);
//            print(arr,n);
//            
//            HEAPSORTY(arr,n);
//            
//    }
    }

