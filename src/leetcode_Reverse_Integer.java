import java.util.Arrays;

public class leetcode_Reverse_Integer {
	 public static int reverse(int x) {
		  long result =0;
	        while(x != 0)
	        {
	            result = (result*10) + (x%10);
	            if(result > Integer.MAX_VALUE) return 0;
	            if(result < Integer.MIN_VALUE) return 0;
	            x = x/10;
	        }
	        return (int)result;
	        
	    }
	 
	 public static void main(String[] args) {

			
			System.out.println("Expect Output 321 , Real Output : "+reverse(123));			
			System.out.println("Expect Output -321 , Real Output : "+reverse(-123));
			System.out.println("Expect Output 21 , Real Output : "+reverse(120));
			System.out.println("Expect Output 0 , Real Output : "+reverse(0 ));
			
			System.out.println("Expect Output 0 , Real Output : "+reverse(1534236469));

		}
}
