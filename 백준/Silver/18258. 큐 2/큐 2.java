import java.io.*;
import java.util.*;


class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        LinkedList<Integer> list = new LinkedList<>();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken();

            switch (a) {
                case "push":
                    list.add(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    if (list.isEmpty()) sb.append(-1).append("\n");
                    else {
                        sb.append(list.peek()).append("\n");
                        list.poll();
                    }
                    break;
                case "size":
                    sb.append(list.size()).append("\n");
                    break;
                case "empty":
                    if (list.isEmpty()) sb.append(1).append("\n");
                    else sb.append(0).append("\n");
                    break;
                case "front":
                    if(list.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(list.peek()).append("\n");
                    break;
                case "back":
                    if (list.isEmpty()) sb.append(-1).append("\n");
                    else sb.append(list.peekLast()).append("\n");
                    break;

            }





        }


        System.out.println(sb);
    }}


