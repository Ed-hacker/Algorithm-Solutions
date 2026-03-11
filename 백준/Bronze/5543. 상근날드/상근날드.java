import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int burger = 2000;
        int drink = 2000;
        for(int i = 0; i < 3; i++){
            int burger_price = Integer.parseInt(br.readLine());
            burger = Math.min(burger,burger_price);
        }
        for(int j = 0; j < 2; j++){
            int drink_price = Integer.parseInt(br.readLine());
            drink = Math.min(drink_price,drink);
        }
        System.out.println(burger+drink-50);


    }
}