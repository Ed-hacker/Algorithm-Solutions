import java.util.Scanner;

class Main {
    static int N;
    static int M;
    static boolean[] visited;
    static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); //숫자 크기
        M = sc.nextInt(); // 숫자 갯수

        visited = new boolean[N+1];
        arr = new int[M];

        dfs(0);

        sc.close();


    }


    public static void dfs(int depth){
        //종료할 때 출력!
        if(depth == M) {//체크해야함 4
            for(int i = 0; i < M; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            return;
        } //종료 조건

        for(int j=1; j <= N; j++){
            if(!visited[j]){
                visited[j] = true;

                arr[depth] = j;


                dfs(depth+1); //이러면 depth+1이 depth로 가버림 뺴기는 해줄 필요없지 가면 끝이니까


                visited[j] = false;
            }


        }
    }
}