import java.io.*;
import java.util.*;


class Main {
    public static int count = 0;
    public static int recursion(String str, int a, int b){
        count++;
        if(a>=b)return 1;
        else if(str.charAt(a) != str.charAt(b))return 0; //기저조건
        else return recursion(str,a+1,b-1);
    }




    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++){
            count = 0;
            String str = br.readLine();
            sb.append(recursion(str,0,str.length()-1)).append(" ").append(count).append("\n");
        }
        System.out.print(sb);

    }
}


