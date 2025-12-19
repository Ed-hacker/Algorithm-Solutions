import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int line = 1; //초기 변의 개수

        for(int i = 0 ; i < N; i++){
            line *= 2;
        }

        System.out.println((line+1)*(line+1));
    }
}