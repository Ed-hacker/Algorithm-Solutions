import java.io.*;
import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N]; //길이만큼 배열 만들어

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        } //일단 다 넣어

        StringBuilder sb = new StringBuilder();


        int[] sortedDistinct =  Arrays.stream(arr).distinct().sorted().toArray(); //중복 제거 후 정렬된 배열 생성

        Map<Integer, Integer> rankingMap = new HashMap<>();
        for(int i = 0; i < sortedDistinct.length; i++){
            rankingMap.put(sortedDistinct[i], i);
        }

        for(int value : arr){
            sb.append(rankingMap.get(value)).append(" ");
        }

        System.out.println(sb);
            }
}

