package algo;

public class SelectionSort {

public static void main(String[] args) {
//	void sort(int arr[]) 
//	   { 
   int [] arr = {9,5,6,1,4,10,2,3}; 
   int n = arr.length; 
   System.out.println(" inserted array");

   for (int k=0; k<n ; k++) {
    System.out.print( +arr[k] + "  " );
  }
   System.out.println(" ");

 
       // One by one move boundary of unsorted subarray 
       for (int i = 0; i < n-1; i++) 
       { 
           // Find the minimum element in unsorted array 
           int min_idx = i; 
           for (int j = i+1; j < n; j++) 
               if (arr[j] < arr[min_idx]) 
                   min_idx = j; 
 
           // Swap the found minimum element with the first 
           // element 
           int temp = arr[min_idx]; 
           arr[min_idx] = arr[i]; 
           arr[i] = temp; 
       }
       //int n = arr.length; 
       for (int i=0; i<n; ++i) 
           System.out.print(arr[i]+" "); 
       System.out.println(); 
       
}
    

void printArray(int arr[]) { 
       int n = arr.length; 
       for (int i=0; i<n; ++i) 
           System.out.print(arr[i]+" "); 
       System.out.println(); 
   } 
 

}