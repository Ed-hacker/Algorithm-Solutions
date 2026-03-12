import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static class meeting{
        private int start_time;
        private int end_time;

        public meeting(int start_time, int end_time){
            this.start_time = start_time;
            this.end_time = end_time;
        }

        public int getStart_time() {
            return start_time;
        }
        public int getEnd_time(){
            return end_time;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        ArrayList<meeting> arr = new ArrayList<>(N);
        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start_time = Integer.parseInt(st.nextToken());
            int end_time = Integer.parseInt(st.nextToken());
            arr.add(new meeting(start_time,end_time));
        }
        arr.sort((m1,m2) ->{
            if(m1.end_time == m2.end_time){
                return m1.start_time - m2.start_time;
            }

            return m1.end_time - m2.end_time;
        });

        int count = 0;
        int now_time = 0;

        for(int i = 0; i < N; i++){
            if(arr.get(i).getStart_time() >= now_time){
                now_time = arr.get(i).getEnd_time();
                count++;
            }
        }

        System.out.println(count);
    }
}