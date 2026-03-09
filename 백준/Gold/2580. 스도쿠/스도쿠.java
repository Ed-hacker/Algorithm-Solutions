import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    static int[][] arr;

    public static boolean isPossible(int row,int col, int value){
        for(int i = 0; i < 9; i++){
            if(arr[row][i] == value || arr[i][col] == value){ // 행과 열에서 검증
                return false;
            }
        }
        int start_x = (row/3) * 3;
        int start_y = (col/3) * 3;
        for(int i = start_x; i < start_x+3; i++ ){  //박스 안에서 검증
            for(int j = start_y; j < start_y+3; j++){
                if(arr[i][j] == value)return false;
            }
        }
        return true;
    }

    static void backtracking(int row, int col){
        if(col == 9) {
            backtracking(row+1,0);
        return;
        } //행 하나당 한번

        if(row == 9) {
            printResult();
            System.exit(0);
        }

        if(arr[row][col] == 0){
        for(int i = 1; i <=9; i++){
            if(isPossible(row,col,i)){
                arr[row][col] = i;
                backtracking(row, col+1);
                arr[row][col] = 0;
            }
        }
        return;
        }
        backtracking(row,col+1);
    }
    static void printResult(){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                sb.append(arr[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        arr = new int[9][9];
        for(int i = 0; i < 9; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
        for(int j = 0; j < 9; j++){
            int a = Integer.parseInt(st.nextToken());
            arr[i][j] = a;
            }
        } //배열 채우기

        backtracking(0,0);

}
}