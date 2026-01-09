import java.io.*;
import java.util.*;


class Main {
    public static long gdc(long a, long b){ //최대공약수 a가 큰거 b가 작은거
        if(b==0)return a;
        return gdc(b,a%b);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();


            StringTokenizer st = new StringTokenizer(br.readLine());
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());
            long max = Math.max(a,b);
            long min = Math.min(a,b);
            sb.append(a*b/gdc(max,min)).append("\n");



        System.out.println(sb);



        }
}





