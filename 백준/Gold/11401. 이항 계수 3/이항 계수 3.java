import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    private static final long p = 1000000007; //얘로 나눌거임

    private static long calExp(long a, long x){ //a의 x승
        if(x == 1)return a;

        if(x%2 == 0){//짝수면
            long tmp = calExp(a, x/2);
            return tmp * tmp % p;
        }else{//홀수면
            long tmp = calExp(a, x/2);
            return (tmp * tmp) % p * a % p;
        }
    }

    private static long calFac(long a){
        long result = 1;
        for(int i = 1; i <= a; i++){
            result *= i;
            result %= p;
        }
        return result;
    }

    private static long cal(long a, long b){
        long result = 1;
        result *= (a * b) % p;

        return result;
    }



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long n = Long.parseLong(st.nextToken());
        long k = Long.parseLong(st.nextToken());

        System.out.println( cal( calFac(n),cal( calExp(calFac(k),p-2),calExp(calFac(n-k),p-2)) ));
    }
}