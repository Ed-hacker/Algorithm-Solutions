import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    static int[] tmp;
    static int count = 0;
    static int k;

    public static void merge_sort(int[] arr, int p, int r){
        if(p < r){ //둘이 같으면 맨 끝, 배열 크기 1인 곳
            int q = (p+r) / 2;
            merge_sort(arr, p, q); //전반부 정렬
            merge_sort(arr,q+1, r); //후반부 정렬
            merge(arr, p, q ,r); // 병합
        }
    }

    public static void merge(int[] arr, int p, int q, int r){//중간 pivot 까지 매개변수
        int i = p; int j = q + 1; //후반부 첫번째
        int t = 0; //tmp pointer
        while(i <= q && j <= r){ // 전반부나 후반부가 다 쓰일 때 까지
            if(arr[i] <= arr[j]) tmp[t++] = arr[i++]; // 전반부 시작이 더 작으면 전반부 시작 임시저장 (오름차순 전제 되있어서 가능)
            else tmp[t++] = arr[j++];
        }

        while(i <= q) tmp[t++] = arr[i++]; //한쪽 다 쓰이고 남은 부분(제일 큰 부분) 임시저장
        while(j <= r) tmp[t++] = arr[j++];

        i = p; t = 0;
        while(i <= r){
            arr[i++] = tmp[t++]; //이제 i부터 r까지 정렬된 거 적용
            count++;
            if(count == k) {
                StringBuilder sb = new StringBuilder();
                for(int x = 0; x < arr.length; x++){
                    sb.append(arr[x]).append(" ");
                }System.out.println(sb.toString().trim());
                System.exit(0);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        int[] arr= new int[N];
        tmp = new int[N];

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st2.nextToken());
        }
        merge_sort(arr,0,N-1);

        if(count < k) System.out.println(-1);


        }
}
