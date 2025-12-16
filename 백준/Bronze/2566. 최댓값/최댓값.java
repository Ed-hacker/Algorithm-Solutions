import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr2 = new int[9][9];

        int max = 0;
        int N = 0;
        int M = 0;



        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                arr2[i][j] = sc.nextInt();

                if(arr2[i][j] >= max){
                    max = arr2[i][j];
                    N = i+1;
                    M = j+1;
                }
            }
        }

        System.out.println(max);
        System.out.print(N+ " " + M);


    }
}
