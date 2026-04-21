import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int N = sc.nextInt();
        int sum = 0;
        for(int i = 0; i < N ; i++){
            int stockPrice = sc.nextInt();
            int stockNumber = sc.nextInt();
            sum += stockNumber*stockPrice;

        }

        if(sum==price) System.out.println("Yes");
        else System.out.println("No");



    }


}


