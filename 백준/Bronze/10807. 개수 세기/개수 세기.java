import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }

        int a = sc.nextInt();
        int count = 0;

        for(int i = 0; i < N; i++){
            if(arr[i] == a)count++;
        }

        System.out.println(count);

        

    }


}

