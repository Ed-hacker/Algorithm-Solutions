import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] groups = br.readLine().split("-"); //-를 기준으로 나눔
        int result = 0;
        for(int i = 0; i < groups.length; i++){
            int tempSum = 0;
            String[] addition = groups[i].split("\\+");
            for(String num : addition){
                tempSum += Integer.parseInt(num);
            }

            if(i==0){
                result += tempSum;
            } else{
                result -= tempSum;
            }


        }
        System.out.println(result);
    }
}