import java.io.*;
import java.util.*;


class Main {
    public static boolean[] isNotPrime = new boolean[1000001]; //true면 소수 아님 , false면 소수

    public static void getPrime() {
        isNotPrime[0] = true;
        isNotPrime[1] = true;
        for(int i = 2; i*i <= 1000000; i++){
            if(!isNotPrime[i]){// i가 소수라면 i의 배수들을 모두 지움(true로 변경)
                for(int j = i*i; j <= 1000000; j += i){

                    isNotPrime[j] = true;
                }
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        getPrime();

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++){
            int a = Integer.parseInt(br.readLine());
            int count = 0;
            for(int j = 2; j <= a/2; j++){
                if(!isNotPrime[j] && !isNotPrime[a-j])count++;
            }
            sb.append(count).append("\n");
        }

        System.out.println(sb);



    }
}

