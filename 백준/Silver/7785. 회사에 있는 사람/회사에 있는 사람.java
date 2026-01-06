import java.io.*;
import java.util.*;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int N = Integer.parseInt(br.readLine());

        Set<String> set = new HashSet<>();


        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String state = st.nextToken();
            if(Objects.equals(state, "enter")) set.add(name);
            else set.remove(name);
        } //일단 다 넣어

        List<String> result = new ArrayList<>(set);

        Collections.sort(result);
        Collections.reverse(result);

        for(String name : result){
            System.out.println(name);
        }


        }




}
