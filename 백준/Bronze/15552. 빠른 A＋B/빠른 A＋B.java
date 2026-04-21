import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        int N = Integer.parseInt(input);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i = 0; i < N; i++){
            String A = br.readLine();
            StringTokenizer st = new StringTokenizer(A, " ");
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            int result = B+C;
            String D = String.valueOf(result);
            bw.write(D);
            bw.newLine();
        }

        bw.flush();
        
    }


}


