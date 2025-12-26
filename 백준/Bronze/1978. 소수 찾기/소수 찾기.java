import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int count = 0;
            boolean yes = false;
            for(int j = 0; j < N; j++) {//N번 반복
                int M = sc.nextInt();
                if(M == 1)continue;
                else if(M == 2){
                    count++;
                    continue;
                }

                yes = false;

                for (int i = 2; i <= M/2; i++) {
                    if (M % i == 0) {//약수가 잇어
                        yes = true;
                        break;
                    }
                }
                if(!yes)count++;


            }
        System.out.println(count);
        }
    }
