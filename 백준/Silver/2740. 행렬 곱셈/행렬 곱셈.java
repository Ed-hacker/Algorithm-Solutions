import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int[][] arr1 = new int [x][y];

        for(int i = 0; i < x; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < y; j++){
                arr1[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        st = new StringTokenizer(br.readLine());
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());

        int[][] arr2 = new int [x][y];

        for(int i = 0; i < x; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < y; j++){
                arr2[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        StringBuilder sb = new StringBuilder();
        int[][] answer = new int [arr1.length][arr2[0].length];
        for(int i = 0; i < arr1.length; i++){ //arr1 행
            for(int j = 0; j < arr1[0].length; j++){ // arr1 열, arr2 행
                for(int k = 0; k < arr2[0].length; k++){ // arr2 열
                    answer[i][k] += arr1[i][j] * arr2[j][k];
                }
            }
        }
        for(int i = 0; i < answer.length; i++){
            for(int j = 0 ; j < answer[0].length; j++){
                sb.append(answer[i][j]).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);




    }

 }