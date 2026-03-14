import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        for(int i = 97; i <= 122; i++){
            int sum = 0;
            for(int j = 0; j < str.length(); j++){
                if((char)i== str.charAt(j)) sum++;
            }
            System.out.print(sum + " ");
        }

    }
}


