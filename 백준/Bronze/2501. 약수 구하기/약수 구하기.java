import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] numbers = new int[N];
        int count = 0;
        for(int i = 1; i <= N; i++){
            if(N%i == 0){
                numbers[count] = i;
                count++;
            }

        }
        if(numbers[M-1] != 0){
            System.out.println(numbers[M-1]);
        }else System.out.println(0);

        }
    }
