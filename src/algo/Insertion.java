package algo;

public class Insertion {

	public static void main(String[] args) {
	int [] array = {6,4,7,9,2,3,5,8,1};
	for (int i=1;i<array.length; i++) {//outer loop
		int j=i-1;
	    int pass = array[i]; 
	    while(j>=0 && array[j]>pass) {// inner loop
	    		array[j+1]=array[j];
	    		j=j-1;
	    }
	array [j+1] = pass;
	}
  for (int n=	0; n<array.length; n++) {
	System.out.print(array[n]+" ");
}
}
}