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

        long[] Sumarr = new long[N+1];
        int[] cnt = new int[M];
        st = new StringTokenizer(br.readLine());
        for(int i = 1; i < N+1; i++){
            long value = Long.parseLong(st.nextToken());
            Sumarr[i] = (Sumarr[i-1] + value) % M;
            cnt[Math.toIntExact(Sumarr[i])]++;
        }

        long result = cnt[0];

        for(int i = 0; i < M; i++){
            result += (long) cnt[i] *(cnt[i]-1)/2;
        }

        System.out.println(result);

    }

 }