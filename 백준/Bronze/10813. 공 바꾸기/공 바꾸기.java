import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N+1]; //그대로 쓸려고
        int M = sc.nextInt(); //공 바꾸는 횟수



        for(int i = 0; i <= N; i++){
            arr[i] = i;
            }//처음 공 넣기

        for(int j =0; j < M; j++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = arr[b];
            arr[b] = arr[a];
            arr[a] = c;

          }
        for(int k = 1; k<=N;k++){
            System.out.print(arr[k]+" ");
        }


        }



}


