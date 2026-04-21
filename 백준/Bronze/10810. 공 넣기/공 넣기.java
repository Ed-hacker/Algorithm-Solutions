import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N+1]; //그대로 쓸려고
        int count = sc.nextInt(); //넣는 횟수



        for(int i = 0; i < count; i++){
            int a = sc.nextInt();//a에서
            int b = sc.nextInt();//b까지
            int c = sc.nextInt();//c번공을 넣는다
            for(int j = a; j <= b; j++){
                arr[j] = c;
            }

        }
        for(int k = 1; k < N+1; k++){
            System.out.print(arr[k]+" ");
        }

    }


}




