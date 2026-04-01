import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); //수열 크기
        long[] arr = new long[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            arr[i] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(arr);

        int pnt1 = 0;
        int minPnt1 = 0; //현재까지 최소인 왼쪽포인터
        int pnt2 = n-1;
        int minPnt2 = n-1; //현재까지 최소인 오른쪽포인터
        long min = Integer.MAX_VALUE;



        while(pnt1 < pnt2){
            if(arr[pnt1] + arr[pnt2] < 0){ //음수면
                if(Math.abs(arr[pnt1] + arr[pnt2]) <= Math.abs(min)){
                minPnt1 = pnt1;
                minPnt2 = pnt2;
                min = arr[pnt1] + arr[pnt2];
                }
                pnt1++;
            } else if(arr[pnt1] + arr[pnt2] > 0){
                if(arr[pnt1] + arr[pnt2] <= Math.abs(min)){
                    minPnt1 = pnt1;
                    minPnt2 = pnt2;
                    min = arr[pnt1] + arr[pnt2];
                }
                pnt2--;
            }
            else if(arr[pnt1] + arr[pnt2] == 0){
                minPnt1 = pnt1;
                minPnt2 = pnt2;
               break;
            }
        }

        System.out.print(arr[minPnt1] + " " + arr[minPnt2]);
    }
}
