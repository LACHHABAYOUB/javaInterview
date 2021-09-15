
public class SecondMax {
	
	
	 public static int print2largest(int A[],int N) {
		 
		 int max=-1;
		 
		 int SecondMax=-1;
		 
		
		 for (int i=0; i<N; i++) {
			 if(A[i]>max) {
				 SecondMax=max;
				 max=A[i];
			 }
			 
			 if (A[i]<max && A[i]>SecondMax){
				 SecondMax=A[i];
	    	    } 
			 
			 
		 }
		 
			return SecondMax;
	    }
	
	public static void main (String [] Args ) {
		
	     int[] arr1 = {2, 4, 5, 6, 7 };
	     int[] arr2 = {7, 8, 2, 1, 4, 3};
	     int[] arr3 = {1, 2, 3};
	     int[] arr4 = {14, 19, 18, 16, 10 ,12, 7 ,10, 10 ,8, 5, 2, 18, 8 ,2 ,12, 9, 7, 1 ,2 ,5 ,18};


	     
		System.out.println("Expected Output : 6 Real output : "+print2largest(arr1,5));
		System.out.println("Expected Output : 7 Real output : "+print2largest(arr2,6));
		System.out.println("Expected Output : -1 Real output : "+print2largest(arr3,6));
		System.out.println("Expected Output : 18 Real output : "+print2largest(arr4,22));



		
	} 

}
