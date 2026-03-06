import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    static int n;
    static int k;
    static int[] tmp;
    static int count = 0;
    public static void merge_sort(int[] arr,int p, int r){
        if(p<r){
            int q = (p+r)/2;
            merge_sort(arr, p, q);
            merge_sort(arr,q+1 , r);
            merge(arr, p, q ,r, k);

        }

    }

    public static void merge(int[] arr, int p, int q, int r, int k){
        int i  = p;
        int j = q+1;
        int t = p;
        while(i<=q && j <=r){
            if(arr[i] <= arr[j]){
                tmp[t++] = arr[i++];
            }else tmp[t++] = arr[j++];
        }
        while( i <= q){
            tmp[t++] = arr[i++];
        }

        while(j <= r){
            tmp[t++] = arr[j++];
        }
        i = p; t = p;
        while( i <= r){
            arr[i++] = tmp[t++];
            count++;
            if(count == k){
                n = arr[--i];
                break;
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
        else System.out.println(n);






        }


}
