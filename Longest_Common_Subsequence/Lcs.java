package Longest_Common_Subsequence;

public class Lcs {
    public static void main(String[] args) {
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";
        System.out.println(lcs(s1, s2));
    }

    public static int lcs(String s1, String s2) {
        int sn = s1.length();
		int tn = s2.length();
		int[][] dp = new int[sn+1][tn+1];
		for(int i=1; i<=sn; i++){
			for(int j=1; j<=tn; j++){
				// System.out.println("i: "+i+" j: "+j+" s.charAt(i): "+s1.charAt(i)+" t.charAt(j): "+s2.charAt(j)+ " dp[i][j]: "+dp[i][j]);
				if(s1.charAt(i-1)== s2.charAt(j-1)){
					dp[i][j] = 1+ dp[i-1][j-1];
                    System.out.println("if  i: "+i+" j: "+j+" s.charAt(i): "+s1.charAt(i-1)+" t.charAt(j): "+s2.charAt(j-1)+ " dp[i][j]: "+dp[i][j]);
				}else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                    System.out.println("else i: "+i+" j: "+j+" s.charAt(i): "+s1.charAt(i-1)+" t.charAt(j): "+s2.charAt(j-1)+ " dp[i][j]: "+dp[i][j]);
                }
			}
		}
        return dp[sn][tn];
    }
}



