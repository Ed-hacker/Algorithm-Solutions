import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt(); //바꾸는 횟수
        int[] arr = new int[N+1]; //0~N

        for(int i =1;i <= N; i++){
            arr[i] = i;
        }//바구니 이름 부여

        for(int j = 0; j < M; j++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int[] arr2 = new int[101];
            for(int k = a; k <= b; k++){ //[2,3,4] = arr2
                arr2[k] = arr[k];
            }
            int c = b;
            for(int x = a; x<= b; x++){
                arr[x] = arr2[c];
                c--;
            }
        }

        for(int y = 1; y<= N ; y++){
            System.out.print(arr[y]+ " ");
        }



    }

}




