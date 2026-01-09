import java.io.*;
import java.util.*;


class Main {
    public static int gdc(int a, int b){ //최대공약수 a가 큰거 b가 작은거
        if(b==0)return a;
        return gdc(b,a%b);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int max = Math.max(a,b);
            int min = Math.min(a,b);
            sb.append(a*b/gdc(max,min)).append("\n");
        }


        System.out.println(sb);



        }
}