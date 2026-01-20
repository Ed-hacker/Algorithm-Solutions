import java.io.*;
import java.util.*;


class Main {
    public static int fbn(int n){
        if(n==0)return 0;
        if(n==1)return 1; //기저조건

        return fbn(n-1)+fbn(n-2);// 점화식
    }




    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(fbn(N));

    }
}


