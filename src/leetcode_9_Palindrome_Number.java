
public class leetcode_9_Palindrome_Number {
	 public static  boolean isPalindrome(int x) {
		    if (x<0 || (x!=0 && x%10==0)) return false;
		    
		    int result = 0;
		    while (x>result){
		    	result = result*10 + x%10;
		    	x = x/10;
		    }
		    return (x==result || x==result/10);
		    }
	 
	 public static void main(String[] args) {

			
			System.out.println("Expect Output true , Real Output : "+isPalindrome(121));			
			System.out.println("Expect Output false , Real Output : "+isPalindrome(-121));
			System.out.println("Expect Output false , Real Output : "+isPalindrome(10));
			System.out.println("Expect Output false , Real Output : "+isPalindrome(101));
			
			//System.out.println("Expect Output 0 , Real Output : "+isPalindrome(1534236469));

		}
}
