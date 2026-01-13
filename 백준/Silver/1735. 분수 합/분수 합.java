import java.io.*;
import java.util.*;


class Main {
    public static int gcd(int a, int b) {
        while(b != 0){
            int r = a % b;
            a = b;
            b = r;
        } //b가 0이면 그때의 a가 최대공약수
        return a;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int N1 = Integer.parseInt(st1.nextToken());
        int N2 = Integer.parseInt(st1.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int M1 = Integer.parseInt(st2.nextToken());
        int M2 = Integer.parseInt(st2.nextToken());

        int down = (N2*M2)/gcd(N2, M2);
        int up = down/M2*M1+down/N2*N1;

        int a = down/gcd(down,up);
        int b = up/gcd(down,up);

        StringBuilder sb = new StringBuilder();

        sb.append(b).append(" ").append(a);

        System.out.println(sb);





    }


}