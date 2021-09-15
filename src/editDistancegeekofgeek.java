
public class editDistancegeekofgeek {
	
	public static int editDistance(String s, String t) {
		  if (s.equals(t)) {
		        return 0;
		    }
		    if (s.length() == 0 || t.length() == 0) {
		        return Math.abs(s.length() - t.length());
		    }
		    int[][] dp = new int[s.length() + 1][t.length() + 1];
		    for (int i = 0; i <= s.length(); i++) {
		        dp[i][0] = i;
		    }
		    for (int i = 0; i <= t.length(); i++) {
		        dp[0][i] = i;
		    }
		    for (int i = 1; i <= s.length(); i++) {
		        for (int j = 1; j <= t.length(); j++) {
		            if (s.charAt(i - 1) == t.charAt(j - 1)) {
		                dp[i][j] = dp[i - 1][j - 1];
		            } else {
		                dp[i][j] = Math.min(dp[i-1][j-1], Math.min(dp[i-1][j], dp[i][j-1])) + 1;
		            }
		        }
		    }
		    return dp[s.length()][t.length()];   
	}
	
	
	public static void main (String [] args) {
		
		String word1 = "geek";
		String word2 = "gesek";
		String Word3 = "gfg";
		String Word4 = "gfg";
		
		System.out.println("Expected Output : 1 real output : "+editDistance(word1,word2));
		System.out.println("Expected Output : 0 real output : "+editDistance(Word3,Word4));
		

		
		
		

	}

}
