import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static int[][] arr;
    static int N;
    private static int[][] calculate(int[][] tmp1, int[][] tmp2){
        int[][] result = new int [N][N];
        for(int i = 0; i < N; i++){// tmp1의 행
            for(int j = 0; j < N; j++){// tmp2의 열
                for(int k = 0; k < N; k++){ //tmp1의 열, tmp2의 행
                    result[i][j] += tmp1[i][k] * tmp2[k][j];
                }
                result[i][j] %= 1000;
            }
        }
        return result;
    }


    private static int[][] method(long n){
        if(n==1) {// n=1일 때도 1000으로 나눈 나머지를 리턴해야 함!
            int[][] res = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) 
                    res[i][j] = arr[i][j] % 1000;
            }
            return res;
        }
        if(n%2 == 0){
            int[][]tmp = method(n/2);
            return calculate(tmp,tmp);
        }else{//홀수면
            int[][] tmp = method(n/2);
            return calculate(calculate(tmp,tmp),arr);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        long B = Long.parseLong(st.nextToken());

        arr = new int [N][N];
        for(int i = 0; i < N; i++){  //배열 받아오기
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                 arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }


        int[][] answer = method(B);

        StringBuilder sb = new StringBuilder();
        //출력문
        for(int i = 0; i < answer.length; i++){
            for(int j = 0 ; j < answer[0].length; j++){
                sb.append(answer[i][j]).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);




    }

 }