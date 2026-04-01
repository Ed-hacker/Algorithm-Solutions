import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); //수열 크기
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int x = Integer.parseInt(br.readLine());

        Arrays.sort(arr);

        int cnt = 0;
        int pnt1 = 0;
        int pnt2 = n-1;

        while(pnt1 < pnt2){
            if(arr[pnt1] + arr[pnt2] == x){
                cnt++;
                pnt1++;
                continue;
            }
            if(arr[pnt1] + arr[pnt2] > x){
                pnt2--;
                continue;
            }

            if(arr[pnt1] + arr[pnt2] < x){
                pnt1++;
            }
        }

        System.out.println(cnt);
    }
}
