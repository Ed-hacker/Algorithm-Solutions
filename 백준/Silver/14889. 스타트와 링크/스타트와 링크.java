import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    static int[][] arr;
    static int N;
    static int min = Integer.MAX_VALUE;
    static boolean[] visited;

    public static void calculate(){
        int true_result = 0;
        int false_result = 0;
        for(int i = 0; i < N; i++){
            if(visited[i]){
                for(int j = i+1; j < N; j++){
                    if(visited[j]){
                        true_result += arr[i][j]+arr[j][i];
                    }
                }
            }else{
                for(int k = i+1; k < N; k++){
                    if(!visited[k]) false_result += arr[i][k]+arr[k][i];
                }
            }
        }
        min = Math.min(min,Math.abs(true_result-false_result));

    }

    public static void backtracking(int index, int count){
        if(count == N/2){
            calculate();
            return;
        }

        for(int i = index; i < N; i++){
            if(!visited[i]){
                visited[i] = true; //선택
                backtracking( i+ 1, count+1);
                visited[i] = false; // 취소(백트래킹)
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        visited = new boolean[N];
        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
        for(int j = 0; j < N; j++){
            arr[i][j] = Integer.parseInt(st.nextToken());
            }
        } //배열 채우기
        backtracking(0,0);
        System.out.println(min);
    }

}
