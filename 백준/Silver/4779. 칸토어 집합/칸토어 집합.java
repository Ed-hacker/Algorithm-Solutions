import java.io.*;
import java.util.*;


class Main {

    static StringBuilder sb = new StringBuilder();

    public static void recursion(int N){
        if(N==0){sb.append("-");
        return;}

        String a = " ";

        recursion(N-1);

        sb.append(" ".repeat((int)Math.pow(3,N-1)));

        recursion(N-1);
    }




    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while((line = br.readLine()) != null) {
            sb = new StringBuilder();
            int N = Integer.parseInt(line);
            recursion(N);
            System.out.println(sb);


        }

    }
}


