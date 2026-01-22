import java.util.Scanner;

class Main {
    static int N;
    static int M;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();

    public static void dfs(int depth){
        if(depth == M){
            for(int i=0; i < M; i++){
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n"); // 줄 바꿈도 StringBuilder에 추가
            return;
        }//종료조건

        if(depth >= 1){
            for(int j = arr[depth-1]; j <= N; j++){ //
                arr[depth] = j;
                dfs(depth+1);
        }}else{
        for(int j = 1; j <= N; j++){ //
            arr[depth] = j;
            dfs(depth+1);
        }}
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); //자연수 크기
        M = sc.nextInt(); //배열 크기
        arr = new int[M];

        sc.close();

        dfs(0);

        System.out.print(sb);
    }
}