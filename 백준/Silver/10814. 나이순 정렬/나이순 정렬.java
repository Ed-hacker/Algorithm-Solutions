import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;
import java.util.stream.Stream;

class Main {
    public static class person{
        String name;
        int age;

        person(int age, String name){
            this.age = age;
            this.name = name;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        person [] arr = new person[N]; //길이만큼 배열 만들어

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a =Integer.parseInt(st.nextToken());
            String b = st.nextToken();
            arr[i] = new person(a,b);
        } //일단 다 넣어

        Arrays.stream(arr)
                .sorted(Comparator.comparingInt((person s) -> s.age))
                .map((person s) -> s.age +  " " + s.name )
                .forEach(System.out::println);
            }
}
