import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = Integer.parseInt(br.readLine());
        sum += Integer.parseInt(br.readLine());
        sum += Integer.parseInt(br.readLine());
        sum += Integer.parseInt(br.readLine());
        int minute = sum/60;
        int second = sum%60;
        System.out.println(minute);
        System.out.println(second);



    }
}