import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;
import java.util.stream.Stream;

class Main {
    public static class Point{
        int x;
        int y;

        Point(int x, int y){
           this.x = x;
           this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Point [] arr = new Point[N]; //길이만큼 배열 만들어

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a =Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[i] = new Point(a,b);
        } //일단 다 넣어

        Arrays.stream(arr)
                .sorted(Comparator.comparingInt((Point p) -> p.x)
                        .thenComparingInt((Point p)-> p.y))
                .map((Point p) -> p.x +  " " + p.y )
                .forEach(System.out::println);
            }
}
