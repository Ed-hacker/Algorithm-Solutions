import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken()); //추의 개수
        int N = Integer.parseInt(st.nextToken()); //과자의 개수
        int M = Integer.parseInt(st.nextToken()); // 동수가 가진 돈

        int result = K*N - M;
        if(result >= 0) System.out.println(result);
        else System.out.println(0);

    }
}