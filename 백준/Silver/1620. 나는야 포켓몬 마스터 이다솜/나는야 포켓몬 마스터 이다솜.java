import java.io.*;
import java.util.*;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<Integer,String> book = new HashMap<>(); //도감!
        Map<String,Integer> book2 = new HashMap<>(); //도감!



        for(int i = 1; i <= N; i++){
            String name = br.readLine();
            book.put(i,name);
            book2.put(name,i);
        } //일단 다 넣어

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< M; i++){
            String a = br.readLine();
            if(!Character.isDigit(a.charAt(0)))sb.append(book2.get(a)).append("\n");
            else sb.append(book.get(Integer.parseInt(a))).append("\n");
        }


        System.out.println(sb);


        }
}


