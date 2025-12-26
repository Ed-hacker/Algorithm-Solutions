import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {


            int N = sc.nextInt();

            if (N == -1) break;

            int[] numbers = new int[N];
            int sum = 0;
            int count = 0;
            for (int i = 1; i < N; i++) {
                if (N % i == 0) {
                    numbers[count] = i;
                    sum += i;
                    count++;  //N제외 맨 뒤 +1 가르킴
                }

            }
            if (sum == N) {
                System.out.print(N + " = ");
                for (int j = 0; j < count - 1; j++) {
                    System.out.print(numbers[j] + " + ");
                }
                System.out.println(numbers[count - 1]);
            } else {
                System.out.println(N + " is NOT perfect.");
            }

        }
    }}
