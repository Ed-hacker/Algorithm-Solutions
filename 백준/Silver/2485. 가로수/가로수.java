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
        int N = Integer.parseInt(st1.nextToken()); //가로등 갯수

        int[] arr = new int[100000];
        int[] minusarr = new int[99999];//차를 모아 둔 것.
        int gcd = 0;

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(br.readLine());
            if(i>=1){ minusarr[i-1] = arr[i]-arr[i-1];
                if (i == 2) {
                    gcd = gcd(minusarr[i-1],minusarr[i-2]); //1하고0하고
                }else if(i > 2){
                    gcd = gcd(gcd, minusarr[i-1]);
                }

            }
        }
        int count = 0;

        for(int i = 0; i < N-1; i++){
            count += (minusarr[i]/gcd)-1;
        }

        System.out.println(count);

    }


}