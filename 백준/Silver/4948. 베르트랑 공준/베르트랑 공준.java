import java.io.*;
import java.util.*;


class Main {
    public static boolean isPrime(int N) {
        if(N==1)return false;
        else if(N==2 || N==3)return true;
        else if(N%2 == 0 || N%3 == 0)return false;

        for(int i = 5; i*i <= N; i++ ){
            if(N%i == 0)return false;
        }

        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true){
            int N = Integer.parseInt(br.readLine());
            if(N == 0)break;

            int count = 0;

            for(int j = N+1; j <= 2*N; j++ ){
                if(isPrime(j))count++;
            }
            sb.append(count).append("\n");
        }

        System.out.println(sb);



    }
}


