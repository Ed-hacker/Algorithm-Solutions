import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

class Main {
    static long[] HomeArr;
    static long C;
    static long end;

    public static long cal(){
        long start = 1;
        long ans = 0;

        while(start <= end){
            long sum = 0;
            long cnt = 1; //공유기 갯수
            long mid = start + (end-start)/2;  //가장 인접한 공유기의 최대거리 가정
            for(int i = 0; i < HomeArr.length-1; i++){
                sum += HomeArr[i+1] - HomeArr[i];
                if(sum >= mid){
                    cnt++; //공유기 놓고
                    sum = 0; //합 초기화
                }
            }

            if(cnt < C){ //공유기 다 놧는데 더 놔야함
                end = mid -1;
            }else {start = mid +1;
                ans = mid;
            } //공유기

         
        }
        return ans;

    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        C = Long.parseLong(st.nextToken());
        HomeArr = new long[N];


        for(int i = 0; i < N; i++){
            HomeArr[i] = Long.parseLong(br.readLine());
        }
        Arrays.sort(HomeArr);

        end = HomeArr[HomeArr.length-1] - HomeArr[0];

        System.out.println(cal());
    }
}


