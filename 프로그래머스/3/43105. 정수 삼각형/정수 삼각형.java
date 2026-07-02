class Solution {
    public int solution(int[][] triangle) {
        int n = triangle.length;
        if(n == 1){
            return triangle[0][0];
        }

        int[][] mem = new int[n][n];
        mem[0][0] = triangle[0][0];
        for(int i = 0; i < n-1; i++){
            for(int j = 0; j <= i; j++){
                mem[i+1][j] = Math.max(mem[i+1][j], mem[i][j] + triangle[i+1][j]);
                mem[i+1][j+1] = Math.max(mem[i+1][j+1], mem[i][j] + triangle[i+1][j+1]);
            }
        }

        int answer = 0;
        for(int k = 0; k < n; k++){
            answer = Math.max(answer,mem[n-1][k]);
        }
        return answer;
    }
}