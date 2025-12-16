import java.util.Scanner;
import java.lang.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] arr2 = new int[N][M];

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                arr2[i][j] = sc.nextInt();
            }
        } //배열 1

        for(int x = 0; x < N; x++){
            for(int y = 0; y < M; y++){
                arr2[x][y] += sc.nextInt();
                System.out.print(arr2[x][y]+ " ");
            }
            System.out.println("");
        }




    }
}
