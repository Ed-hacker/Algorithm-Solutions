import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] chess = {1,1,2,2,2,8};
        for(int i = 0; i < 6; i++){
            int count = sc.nextInt();
            chess[i] = chess[i]-count;
        }
        for(int j = 0; j < 6; j++){
            System.out.print(chess[j]+ " ");
        }
    }
}