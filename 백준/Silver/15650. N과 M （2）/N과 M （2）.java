import java.util.Scanner;

class Main {
    static int N;
    static int M;
    static int[] arr;
    static boolean[] visited;

    public static void dfs(int depth){
        if(depth == M){
            for(int i = 0; i < M ;i++) {
                System.out.print(arr[i] + " ");
            }

            System.out.println(); // 줄바꿈
            return;
        }

        for(int j = 1; j <= N ; j++){
            if(!visited[j]){ //안간곳이면!
                if((depth==0)){
                    arr[depth] = j;
                    visited[j] = true;
                    dfs(depth+1);
                    visited[j] = false;
                }
                if(depth != 0){
                    if(arr[depth-1]<j) {
                        arr[depth] = j;
                        visited[j] = true;
                        dfs(depth + 1);
                        visited[j] = false;
                    }
                }

            }
        }

    }

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     N = sc.nextInt(); //자연수 크기
     M = sc.nextInt(); //배열 개수
     visited = new boolean[N+1];
     arr = new int[M];

     dfs(0);



    }



}