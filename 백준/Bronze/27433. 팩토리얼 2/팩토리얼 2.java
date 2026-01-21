import java.io.*;
import java.util.*;


class Main {

    public static long recursion(long N){ //3의 배수 27,0,0 (행,열)이라해보자 그러면 9개짜리로 나눠서 가운데 빼고 9돌려야함

          if(N==0)return 1;

          return N * recursion(N-1);
        }



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            long N = Long.parseLong(br.readLine());
            System.out.println(recursion(N));
            recursion(N);


        }



}