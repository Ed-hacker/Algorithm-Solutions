import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static int C;
    static void dfs(long sum , int pnt, ArrayList<Long> subset, ArrayList<Integer> arr){
        if(sum > C) return;

        if(pnt == arr.size()) {
            subset.add(sum);
            return; //전부 다 갈꺼기 때문에 맨 끝에 도달햇을때 조건 걸어서 넣어주면 된다
            //위에 종료조건에서 어차피 해당하지 않은건 다 빠꾸시킨다
        }

        dfs(sum + arr.get(pnt),pnt+1, subset, arr); //현재 원소 포함
        dfs(sum , pnt+1, subset, arr); //현재 원소 포함 x  계속 포함 안 하면 결국 0도 포함되게 되어있음!
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        ArrayList<Integer> arrA = new ArrayList<>();
        ArrayList<Integer> arrB = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            if(i <=N/2){
            arrA.add(Integer.parseInt(st.nextToken()));
            }else arrB.add(Integer.parseInt(st.nextToken()));
        }


        ArrayList<Long> A = new ArrayList<>();
        ArrayList<Long> B = new ArrayList<>();


        dfs(0,0,A, arrA);
        dfs(0,0,B, arrB);

        Collections.sort(A);
        B.sort(Collections.reverseOrder()); //얘는 내림차순

        long cnt = 0;
        int pA = 0;
        int pB = 0;

        while(pA < A.size() && pB < B.size()){
            long nowSum = A.get(pA) + B.get(pB);
            if(nowSum > C) pB++;
            else {
                cnt += B.size() - pB;
                pA++;
            }
        }
        System.out.println(cnt);
    }
}