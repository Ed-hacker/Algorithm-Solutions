import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());

        int[] arr = new int[N + 1];
        int[] sumArr = new int[N + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            sumArr[i] = sumArr[i - 1] + arr[i]; //부분합 계산
        }
        int start = 1;
        int end = 1;
        int result = Integer.MAX_VALUE;
        while (true) {
            if (start == end && arr[start] >= S){
                result = 1;
                break;
            }else if(end > N) {
                break;
            }
            if (sumArr[end] - sumArr[start - 1] >= S) {
                result = Math.min(result, end - start + 1);
                start++;
            }//등호 상관없다는 판단 확인해보기
            else end++;
        }

        if(result == Integer.MAX_VALUE) System.out.println(0);
        else System.out.println(result);
    }
}