import java.util.Scanner;

class Main {
    public static void calculate(int change){
        int quarter = change / 25;
        System.out.print(quarter+ " ");
        change %= 25;

        int dime = change / 10;
        System.out.print(dime+ " ");
        change %= 10;

        int Nickel = change / 5;
        System.out.print(Nickel+ " ");
        change %= 5;

        System.out.println(change);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i = 0; i < N; i++){
            calculate(sc.nextInt());
        }


    }
}