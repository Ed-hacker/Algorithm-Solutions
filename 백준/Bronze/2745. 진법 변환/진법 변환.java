import java.util.Scanner;

class Main {
    public static int number(char a){
        if(a < 65)return (int)a-48;//숫자는 그대로 쓰자
        else return (int)a-55;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        int N = sc.nextInt(); //N진법
        double result = 0;


        for(int i = st.length()-1; i >= 0; i--){ //첫째자리에서 마지막자리까지 // 자리수는 N-i-1
             result +=   number(st.charAt(i)) * (N * Math.pow(N,st.length()-i-2));
   
        }

        System.out.println((int)result);

    }
}