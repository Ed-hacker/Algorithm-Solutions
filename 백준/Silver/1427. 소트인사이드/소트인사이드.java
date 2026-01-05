import java.io.*;
import java.util.Arrays;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String N = br.readLine();
        int[] arr = new int[N.length()]; //길이만큼 배열 만들어

        for(int i = 0; i < N.length(); i++){
            arr[i] = N.charAt(i) -'0';
        }

        Arrays.sort(arr);

        for(int j = N.length()-1; j >= 0; j--){
            bw.write(arr[j]+"");
        }

        bw.flush();

        bw.close();

            }
    }




