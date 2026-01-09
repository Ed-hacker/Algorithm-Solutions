import java.io.*;
import java.util.*;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set11 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> set22 = new HashSet<>();


        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            int a =Integer.parseInt(st1.nextToken());
            set1.add(a);
            set11.add(a);
        } //일단 다 넣어

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++){
            int b = Integer.parseInt(st2.nextToken());
            set2.add(b);
            set22.add(b);
        }

        set1.removeAll(set22);
        set2.removeAll(set11);

        int result = set1.size()+set2.size();

        System.out.println(result);



        }
}



