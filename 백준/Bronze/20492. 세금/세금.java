import java.io.IOException;
import java.util.Scanner;


class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.print(N*78/100+" ");
        System.out.println(N-N*20/100*22/100);
    }
}