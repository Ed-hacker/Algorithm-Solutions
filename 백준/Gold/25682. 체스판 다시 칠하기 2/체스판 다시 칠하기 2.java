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
        int[][][] arrSum = new int[N+1][M+1][2];

        for(int i = 1; i < N+1; i++){
            String str = br.readLine();
            for(int j = 1; j < M+1; j++) {
                if ((i + j) % 2 == 0) { //1,1하고 같아야함
                   if(str.charAt(j-1) == 'B'){
                       arrSum[i][j][1] = 1;
                   } else arrSum[i][j][0] = 1;
                }else{ //1,1하고 반대여야함
                    if(str.charAt(j-1) == 'B'){
                        arrSum[i][j][0] = 1;
                    }else arrSum[i][j][1] = 1;

                }

                for (int m = 0; m < 2; m++) {
                    arrSum[i][j][m] = arrSum[i][j][m] + arrSum[i - 1][j][m] + arrSum[i][j - 1][m] - arrSum[i - 1][j - 1][m];
                }
            }
        }

        int min = Integer.MAX_VALUE;

        for(int i = k; i <= N; i++) {
            for (int j = k; j <= M; j++) {
                min = Math.min(min, Math.min(
                        arrSum[i][j][0] - arrSum[i - k][j][0] - arrSum[i][j - k][0] + arrSum[i - k][j - k][0],
                        arrSum[i][j][1] - arrSum[i - k][j][1] - arrSum[i][j - k][1] + arrSum[i - k][j - k][1]
                ));
            }
        }
        System.out.println(min);
    }
}


