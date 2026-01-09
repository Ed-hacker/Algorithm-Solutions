import java.io.*;
import java.util.*;


class Main {
    public static int calculate(int a, int b){
        int min = Math.min(a,b);//작은거 6
        int max = Math.max(a,b);//큰 거 10
        int result = 1;
        boolean end = false;

        int c = min;  //6

        while(!end) {
            end = true;
            for (int i = c; i >= 2; i--) { //큰거부터이
                if(min%i==0 && max%i ==0){
                    min /= i;//3
                    max /= i;//5
                    result *= i;//2
                    end = false; //나누어졋음
                }
            }

        }
        result = result * min * max;
        return result;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append(calculate(a,b)).append("\n");
        }


        System.out.println(sb);



        }
}




