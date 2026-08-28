class Solution {
    public int solution(int n, int[][] results) {
        boolean[][] win = new boolean[n+1][n+1];

        for(int[] res : results ){
            win[res[0]][res[1]] = true; //경기결과 기록
        }

        for(int k = 1; k <= n; k++){
            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= n; j++){
                    if(win[i][k] && win[k][j])
                        win[i][j] = true;
                }
            }
        } //연속관계 기록


        int answer = 0;

        for(int i = 1; i <=n; i++){//기준 선수
            int cnt = 0;
            for(int j = 1; j <=n; j++){
                if(win[i][j] || win[j][i]) cnt++;
            }

            if(cnt == n -1 )answer++;
        }

        return answer;
    }
}