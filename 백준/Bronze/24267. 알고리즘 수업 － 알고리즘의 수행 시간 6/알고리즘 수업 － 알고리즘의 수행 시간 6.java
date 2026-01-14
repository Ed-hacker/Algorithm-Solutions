import java.io.*;
import java.util.*;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Integer.parseInt(br.readLine()); //사람 수
        if(N>=3) {
            System.out.println(N * (N - 1) * (N - 2) / 6);
            System.out.println(3);
        }else{
            System.out.println(0);
            System.out.println(3);
        }



    }
}

