import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static long[][] arr = {{1,1},{1,0}};

    private static long[][] calculate(long[][] tmp1, long[][] tmp2){
        long[][] result = new long [tmp1.length][tmp2[0].length];
        for(int i = 0; i < tmp1.length; i++){// tmp1의 행
            for(int j = 0; j < tmp2[0].length; j++){// tmp2의 열
                for(int k = 0; k < tmp2.length; k++){ //tmp1의 열, tmp2의 행
                    result[i][j] +=  tmp1[i][k] * tmp2[k][j];
                    result[i][j] %= 1000000007;
                }

            }
        }
        return result;
    }


    private static long[][] method(long n){
        if(n==1) {// n=1일 때도 1,000,000,007로 나눈 나머지를 리턴해야 함!
            return arr;
        }
        if(n%2 == 0){//짝수면
            long[][]tmp = method(n/2);
            return calculate(tmp,tmp);
        }else{//홀수면
            long[][] tmp = method(n/2);
            return calculate(calculate(tmp,tmp),arr);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long n = Long.parseLong(st.nextToken());

        long[][] basic = {{1},{1}};
        if(n==1 || n==2){
            System.out.println(1);
        }else {
            long[][] answer = calculate(method(n - 1), basic);
            System.out.println(answer[1][0]);
        }
    }

 }