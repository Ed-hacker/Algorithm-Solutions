import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[][] arr2 = new boolean[100][100];

        int N = sc.nextInt();
        for(int i = 0; i < N; i++){
            int x = sc.nextInt(); // x축하고 떨어진 거리 3
            int y = sc.nextInt(); // y축하고 떨어진 거리 7
            for(int j = x; j < x+10; j++){//좌표로 하면 j가 0부터 시작해야해서
                for(int k = y; k< y+10; k++){
                    arr2[k][j] = true;
                }
            }
        }
        int count = 0;
        for(int a = 0; a < 100; a++ ){
            for(int b = 0; b<100; b++){
                if(arr2[a][b])count++;
            }
        }
        System.out.print(count);
    }
}