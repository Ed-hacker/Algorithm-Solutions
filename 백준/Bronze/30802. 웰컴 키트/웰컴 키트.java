import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] t = new int[6];

        int tCount = 0;

        for(int i = 0; i < 6; i++){
            t[i] = sc.nextInt();
        }

        int T = sc.nextInt();
        int P = sc.nextInt();

        for(int j = 0; j < 6; j++){
            if(t[j]!=0){
            tCount += (t[j]-1)/T+1;}
        }
        System.out.println(tCount);

        System.out.print(N/P+" ");
        System.out.println(N%P);





            }
    }




