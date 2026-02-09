import java.io.IOException;
import java.util.Scanner;


class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(str.equals("N") || str.equals("n")){
            System.out.println("Naver D2");
        }else System.out.println("Naver Whale");


    }
}