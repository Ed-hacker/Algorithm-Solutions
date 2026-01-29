import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;


class Main {
    static int[] arr;
    static int count = 0;

    static void nQueen(int depth){ //현재 행 = depth
        if(depth == arr.length){ //끝까지 왔으면.
            count++;
            return;
        }

        if(depth == 0){
            for(int i = 0; i < arr.length; i++){
                arr[0]=i;
                nQueen(1);
            }
            return;
        }

        for(int j = 0; j < arr.length; j++) {//현재 행의 모든 열에 대하여
            boolean check = true;
            for (int k = 0; k < depth; k++) { //모든 위의 이미 찍은 점들에 대하여
                if ((j == arr[k]) || (Math.abs(depth - k) == Math.abs(j - arr[k]))) {
                    check = false; //이러면 안됭
                    break;
                }
            }
            if (check) {//되는데면
                arr[depth] = j;
                nQueen(depth + 1);
            }
        }


    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        int N = Integer.parseInt(st.nextToken());
        arr = new int[N];

        nQueen(0);

        System.out.println(count);


    }
}