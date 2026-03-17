import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static int[][] arr;
    static int countZero = 0;
    static int countBlue = 0;

    private static boolean check(int x, int y, int n){ //시작좌표, 체크할 정사각형 크기
        for(int i = x; i < x+n; i++){
            for(int j = y; j < y+n; j++){
                if(arr[x][y] != arr[i][j])return false;
            }
        }
        if(arr[x][y] == 0) countZero++;
        else countBlue++;//사각형 인정~
        return true;
    }

    private static void divide(int x, int y, int n){
        if(!check(x,y,n)){
            divide(x,y,n/2);
            divide(x+n/2, y, n/2);
            divide(x, y + n/2 , n/2);
            divide(x + n/2, y + n/2 , n/2);
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new int[N][N];

        for(int i = 0; i < N; i ++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        divide(0,0,N);

        System.out.println(countZero);
        System.out.println(countBlue);



    }

 }