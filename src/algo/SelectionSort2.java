package algo;

public class SelectionSort2 {

	public static void main(String[] args) {
		int[] array= {4,5,8,1,2,9,6,7,3};
		int min;
		for (int i=0;i<array.length;i++) {//outer loop
		min=i;
		    for(int j=i+1;j<array.length;j++) {//inner loop
		    if(array[j]<array[min]) {
		    min=j;
		}

		}
		int temp =array[min];
		array[min]=array[i];
		array[i]=temp;
		}
		  
		
		//to display
		 for(int n=0; n<array.length;n++) {
		  System.out.print(array[n]+" ");
		    }
		   }
		}