import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static int N;
    static int[][] arr;

    static int calculate(int x1,int y1, int x2, int y2){
        return arr[x2][y2] - arr[x1-1][y2] - arr[x2][y1-1] + arr[x1-1][y1-1];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        arr = new int[N+1][N+1];

        for(int i = 1; i < N+1; i++){
            StringTokenizer st3 = new StringTokenizer(br.readLine());
            for(int j = 1; j < N+1; j++){
                arr[i][j] = Integer.parseInt(st3.nextToken());
                arr[i][j] = arr[i][j] + arr[i][j-1] + arr[i-1][j] - arr[i-1][j-1]; //누적합만 저장(사각형 기준)
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < M; i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st2.nextToken());
            int y1 = Integer.parseInt(st2.nextToken());
            int x2 = Integer.parseInt(st2.nextToken());
            int y2 = Integer.parseInt(st2.nextToken());
            sb.append(calculate(x1,y1,x2,y2)).append("\n");
        }

        System.out.println(sb);




    }
}


