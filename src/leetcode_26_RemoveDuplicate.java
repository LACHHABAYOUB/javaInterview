
public class leetcode_26_RemoveDuplicate {
	  public static int removeDuplicates(int[] nums) {
		  int c = 1;
	        for ( int i = 1; i < nums.length; i++ ) {
	            if ( nums[i] != nums[i - 1] ) {
	                nums[c++] = nums[i];
	            }
	        }
	        return c ;
	    }
	  
	  public static void main(String[] args) {

		  	int num1 []= {1,1,2};
			int num2 []= {0,0,1,1,1,2,2,3,3,4};
			
			System.out.println("Expect Output 2 , Real Output : "+removeDuplicates(num1));			
			System.out.println("Expect Output 5 , Real Output : "+removeDuplicates(num2));
	

		}
}
