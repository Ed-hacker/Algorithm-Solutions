import java.util.Scanner;

class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i = N-1; i >= 0; i--){ //i -> 1까지함 4 3 2 1 0 이거 다 i 임
            for(int j = 0; j < i; j++){
                System.out.print(" ");

            }
            for(int k = 1; k <= N-i; k++){  // 1 2 3 4 5
                System.out.print("*");
            }
            System.out.println(" ");

        }






    }
}
