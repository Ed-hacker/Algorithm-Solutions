import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        while(true){
            String a = br.readLine();
            if(a.equals("#"))break;

            int sum = 0;
            for(int i = 0; i < a.length(); i++){
                if(a.charAt(i)=='a' ||a.charAt(i)=='A' ||a.charAt(i)=='e' ||a.charAt(i)=='E' ||a.charAt(i)=='i' ||a.charAt(i)=='I'
                        ||a.charAt(i)=='o' ||a.charAt(i)=='O' ||a.charAt(i)=='u' ||a.charAt(i)=='U' )sum++;
            }
            System.out.println(sum);

        }


    }
}