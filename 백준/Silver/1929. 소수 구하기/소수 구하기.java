import java.io.*;
import java.util.*;


class Main {
    public static boolean check(long N) { //소수이면 true 아니면 false
        if(N==1)return false;
        else if(N==2 || N==3)return true;
        else if(N%2==0 || N%3 ==0)return false;

        for(long i = 5; i*i <= N; i++){ //1,2,3,4는 다 걸러냇으니 5부터 시작
            if(N%i == 0)return false;
        }

        return true; //이거 다 뚫어 냇으면 소수이다!
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long N = Long.parseLong(st.nextToken());
        long M = Long.parseLong(st.nextToken());

        StringBuilder sb = new StringBuilder();
        for(long i = N; i <= M; i++){
            if(check(i))sb.append(i).append("\n");
            }
        System.out.println(sb);

    }



    }


