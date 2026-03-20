import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static long[] lineArr;
    static int K;
    static long end;


    private static long cal() {
        long low = 1;
        long high = end;
        long ans = 0; // 최종 정답을 저장할 변수

        while (low <= high) {
            long mid = low + (high - low) / 2;

            if (mid == 0) { // 0으로 나누기 방지 안전장치
                low = mid + 1;
                continue;
            }

            long cnt = 0;
            for (int i = 0; i < lineArr.length; i++) {
                cnt += lineArr[i] / mid;
            }

            if (cnt >= K) {
                // K개 이상 만들 수 있다면? "더 길게 자를 가능성이 있다!
                ans = mid;    // 일단 현재 길이를 정답 후보로 찜
                low = mid + 1; // 더 큰 길이를 찾아 오른쪽으로 이동
            } else {
                // K개보다 적게 만들어지면? 너무 길다 줄이자
                high = mid - 1; // 왼쪽 범위로 이동
            }
        }
        return ans; // 성공했던 값 중 가장 컸던 값이 남음
    }



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        lineArr = new long[N];

        long sum = 0;
        for(int i = 0; i < N; i++){
            lineArr[i] = Long.parseLong(br.readLine());
            sum += lineArr[i];
        }

        end = sum / K;


        System.out.println(cal());
    }
}