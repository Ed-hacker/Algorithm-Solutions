import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int L = Integer.parseInt(st.nextToken());
        int P= Integer.parseInt(st.nextToken());
        int cnt = L*P;

        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        for (int i= 0; i < 5; i++) {
           int paper = Integer.parseInt(st.nextToken());
           sb.append(paper-cnt).append(" ");

        }

        System.out.println(sb);


    }
}