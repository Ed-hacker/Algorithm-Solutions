import java.io.*;
import java.util.*;


class Main {
    static boolean[][] arr;

    public static void recursion(int M,int a, int b){ //3의 배수 27,0,0 (행,열)이라해보자 그러면 9개짜리로 나눠서 가운데 빼고 9돌려야함

          if(M==3){
              for(int i = a; i < a+3; i++){
                  for(int j = b; j < b+3; j++ ){
                  arr[i][j] = true;}
              }
              arr[a+1][b+1] = false; //가운데만 false
              return;
          }

          recursion(M/3,a,b);
          recursion(M/3,a , b+M/3);
          recursion(M/3,a , b+2*M/3);

          recursion(M/3,a+M/3,b);
         //recursion(M/3,a+M/3 , b+M/3); 얘를 없애야 함
          recursion(M/3,a+M/3 , b+2*M/3);

          recursion(M/3,a+2*M/3,b);
          recursion(M/3,a+2*M/3 , b+M/3);
          recursion(M/3,a+2*M/3 , b+2*M/3);



        }



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());
            arr = new boolean[N][N];
            StringBuilder sb = new StringBuilder();
            recursion(N,0,0);
            for(int i = 0; i < N; i++){
                for(int j = 0; j < N; j++){
                    if(arr[i][j])sb.append("*");
                    else sb.append(" ");
                }
                sb.append("\n");

            }

            System.out.println(sb);


        }



}