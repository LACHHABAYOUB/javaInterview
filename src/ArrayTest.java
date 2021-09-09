import java.util.ArrayList;
import java.util.List;

public class ArrayTest {
	//Given an array a of n integers, return an array of integers which contains [1st integer, sum of next 2 integers (2nd, 3rd),
	// sum of next 3 integers (4th, 5th, 6th)]


	public static void main(String []args){
	     
	     int[] nums = {1,6,8,5,9,4,7,2};
	     
	     List<Integer> res = new ArrayList<>();
	     
	    int  i = 0, n = 8, k = 0, sum = 0;
	    
	    
	while(i < n){
	    int nextStop = ++k + i;
	    while(i < nextStop && i < n){
	    sum += nums[i++];
	    }
	    res.add(sum);
	    sum = 0;
	}
	     
	    System.out.println(res);
	 }
}
