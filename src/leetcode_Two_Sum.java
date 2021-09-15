import java.util.Arrays;

public class leetcode_Two_Sum {
	
	    public static int[] twoSum(int[] nums, int target) {
	    
	        for (int i=0; i<nums.length;i++){
	          for (int j = i + 1; j < nums.length; j++){
	            if (nums[i] + nums[j] == target){
	            return new int[] { i, j };
	            }
	          }
	        }
	        return null;

	    }
	
		public static void main(String[] args) {

			int num1 []= {2,7,11,15};
			int num2 []= {3,2,4};
			int num3 []= {3,3};
			
			System.out.println("Expect Output [0,1] , Real Output : "+Arrays.toString(twoSum(num1,9)));			
			System.out.println("Expect Output [1,2] , Real Output : "+Arrays.toString(twoSum(num2,6)));
			System.out.println("Expect Output [0,1] , Real Output : "+Arrays.toString(twoSum(num3,6)));
		}
	}
