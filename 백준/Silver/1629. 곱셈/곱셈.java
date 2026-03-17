import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static long a;
    static long c;

    private static long calculate(int n){//어디까지 나눳는지
        if(n==1)return a % c;

        long tmp = calculate(n/2);

        if(n%2 == 0){//짝수
            return (tmp * tmp) % c;
        }else {//홀수
            return ( tmp * tmp % c ) * calculate(1) % c;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        a = Long.parseLong(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        c = Long.parseLong(st.nextToken());

        System.out.println(calculate(b));
    }

 }