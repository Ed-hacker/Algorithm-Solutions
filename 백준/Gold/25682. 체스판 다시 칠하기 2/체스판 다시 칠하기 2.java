import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[][] arrSum = new int[N+1][M+1];

        for(int i = 1; i < N+1; i++){
            String str = br.readLine();
            for(int j = 1; j < M+1; j++) {
                if ((i + j) % 2 == 0 && str.charAt(j-1) == 'W') { //1,1하고 같아야함
                   arrSum[i][j] = 1;
                }else if((i + j) % 2 == 1 && str.charAt(j-1) == 'B'){ //1,1하고 반대여야함
                     arrSum[i][j]= 1;
                }
                    arrSum[i][j]= arrSum[i][j] + arrSum[i - 1][j]+ arrSum[i][j - 1]- arrSum[i - 1][j - 1];
                }
            }
        

        int min = Integer.MAX_VALUE;

        for(int i = k; i <= N; i++) {
            for (int j = k; j <= M; j++) {
                int sumA = arrSum[i][j]- arrSum[i - k][j]- arrSum[i][j - k]+ arrSum[i - k][j - k];
                min = Math.min(min, Math.min(sumA, k*k - sumA));
            }
        }
        System.out.println(min);
    }

 }