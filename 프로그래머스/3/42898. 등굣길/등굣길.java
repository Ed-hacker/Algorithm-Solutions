class Solution {
    public int solution(int m, int n, int[][] puddles) {
        long[][] dp = new long[n+1][m+1];
        for(int i = 0; i < puddles.length; i++){
               int x = puddles[i][0];
               int y = puddles[i][1];
               dp[y][x] = Long.MAX_VALUE;
            }
        dp[0][1] = 1;
        
        
        for(int x = 1; x <= n; x++){
            for(int y = 1; y <= m; y++){
                if(dp[x][y] ==Long.MAX_VALUE) dp[x][y] = 0;
                else {dp[x][y] = dp[x-1][y] % 1000000007 + dp[x][y-1] % 1000000007;
                     dp[x][y] %= 1000000007; }
                
            }
        }
        
        return (int)dp[n][m];
        }          
}