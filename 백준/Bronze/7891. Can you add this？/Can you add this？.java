import java.io.IOException;
import java.util.Scanner;


class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < N ; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a+b);
       
        }

    }
}