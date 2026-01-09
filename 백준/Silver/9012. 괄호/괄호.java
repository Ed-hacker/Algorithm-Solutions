import java.io.*;
import java.util.*;


class Main {
    public static String calculate(String ps) {
        int count = 0;
        String result = "YES";
        for(int i = 0; i < ps.length(); i++){
            if(ps.charAt(i) == '(') count++;
            else count--;

            if(count < 0)
                result = "NO";
            }

        if(count != 0) result = "NO";

        return result;
        }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int N = Integer.parseInt(br.readLine());//명령 갯수

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++){
            String ps = br.readLine();
            sb.append(calculate(ps)).append("\n");
        }

        System.out.println(sb);
}

        }



