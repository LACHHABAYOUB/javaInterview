	
public class leetcode_26_Edit_Distance {
	
	
	public static int minDistance(String word1, String word2) {
        int m = word1.length(), n = word2.length();

        int[] dp = new int[n + 1];

        for(int j = 0; j <= n; j++) {
            dp[j] = j;
        }

        for(int i = 1; i <= m; i++) {
            int[] newDp = new int[n + 1];
            newDp[0] = i;
            for(int j = 1; j <= n; j++) {
                if(word1.charAt(i - 1) == word2.charAt(j - 1))
                    newDp[j] = dp[j - 1];
                else
                    newDp[j] = min(dp[j - 1] + 1, dp[j] + 1, newDp[j - 1] + 1);
            }
            dp = newDp;
        }
        return dp[n];
    }

    private static int min(int a, int b, int c) {
        if(a <= b && a <= c) return a;
        else if (b <= a && b <= c) return b;
        else return c;
    }
	
    public static void main(String args[]){
    	String word1="horse";
    	String word2="ros";
    	String word3="intention";
    	String word4="execution";
    	
    	
    	System.out.println("Expect Output 3 , Real Output : "+minDistance(word1,word2));
    	System.out.println("Expect Output 5 , Real Output : "+minDistance(word3,word4));

    }
}
