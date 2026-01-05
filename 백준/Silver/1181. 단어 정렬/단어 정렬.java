import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N]; //길이만큼 배열 만들어

        for(int i = 0; i < N; i++){
            arr[i] = br.readLine();
        }

        Arrays.stream(arr)
                .distinct()
                .sorted(Comparator.comparing(String::length)
                        .thenComparing(Comparator.naturalOrder()))
                .forEach(System.out::println);
            }
    }



