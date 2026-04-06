import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        if (N == 1) {
            System.out.println(0);
            return;
        }

        boolean[] isNotPrime = new boolean[N + 1];
        isNotPrime[0] = isNotPrime[1] = true;
        for (int i = 2; i * i <= N; i++) {
            if (!isNotPrime[i]) {
                for (int j = i * i; j <= N; j += i) {
                    isNotPrime[j] = true;
                }
            }
        }

        int[] arr = new int[N + 1]; //0~20
        int cnt = 0;
        for (int i = 2; i <= N; i++) {
            if (!isNotPrime[i]) {
                arr[cnt++] = i;
            }
        }

        int start = 0;
        int end = 0;
        int sum = 2;
        int result = 0;
        while(arr[end] != 0){ //마지막 소수 너머에 도달하면 종료
            if(sum == N) {result++;
                sum += arr[++end];
            }
            else if(sum > N) sum -= arr[start++];
            else sum += arr[++end]; //end는 올리고 더함
        }

        System.out.println(result);

    }
}