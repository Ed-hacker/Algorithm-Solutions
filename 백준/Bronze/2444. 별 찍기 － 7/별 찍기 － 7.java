import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 1; i <= N; i++){
            for(int j = 0; j < N-i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= 2*i-1; k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for(int x = N-1; x > 0; x--){//4 3 2 1
            for(int y = 1; y <= N-x; y++){ //1 2 3 4
                System.out.print(" ");
            }
            for(int z = 2*x-1; z >0 ;z--){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}