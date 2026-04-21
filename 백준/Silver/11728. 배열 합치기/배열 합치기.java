import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int length = N + M;

        int[] arr = new int[length];

        for(int i=0; i < length; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();
        for(int j = 0; j < length; j++){
            sb.append(arr[j]);
            if(j < length - 1) sb.append(" ");
        }
        System.out.print(sb);
    }
}