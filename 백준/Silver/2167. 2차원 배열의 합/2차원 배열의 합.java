import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[][] arr = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        //2차원 배열 생성
        int count = scanner.nextInt();

        for(int k = 0; k < count; k++){

            int y1 = scanner.nextInt()-1;
            int x1 = scanner.nextInt()-1;

            int y2 = scanner.nextInt()-1;
            int x2 = scanner.nextInt()-1;
            //x좌표 y좌표 받기

            int sum = 0;
            for (int i = y1; i <= y2; i++) {
                for (int j = x1; j <= x2; j++) {
                    sum += arr[i][j];
                }
            }
            System.out.println(sum);
        }
    }
}