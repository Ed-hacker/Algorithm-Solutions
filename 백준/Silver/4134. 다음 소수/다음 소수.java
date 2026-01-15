import java.io.*;
import java.util.*;


class Main {

    public static long gcd(long a, long b){
        if(b == 0)return a;

        return gcd(b,a%b);
    }

    public static boolean check(long N) { //소수이면 true 아니면 false
        if(N==1)return false;
        else if(N==2 || N==3)return true;
        else if(N%2==0 || N%3 ==0)return false;

        for(long i = 2; i*i <= N; i++){
            if(N%i == 0)return false;
        }
         
        return true; //이거 다 뚫어 냇으면 소수이다!
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); //테스트 케이스 갯수

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++){
            long M = Long.parseLong(br.readLine());
            while(true){
                if(M == 1) {sb.append(2).append("\n");;
                break;}
                else if(check(M)){sb.append(M).append("\n");
                break;};
                M++;
            }
        }

        System.out.println(sb);



    }
}

