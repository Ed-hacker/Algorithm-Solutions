import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int NN = sc.nextInt();
            int[] numbers = new int[NN-N+1];
            int count = 0;
            boolean yes = false;
            for(int j = N; j <= NN; j++) {//N~NN 까지

                if(j == 1)continue;
                else if(j == 2){
                    numbers[count]= j;
                    count++;
                    continue;
                }

                yes = false;

                for (int i = 2; i <= j/2; i++) {
                    if (j % i == 0) {//약수가 잇어
                        yes = true;
                        break;
                    }
                }
                if(!yes){
                    numbers[count]= j;
                    count++;
                }


            }
            int sum = 0;

        if(numbers[0]==0) System.out.println(-1);
        else {
            for(int k = 0; k < numbers.length; k++){
                sum += numbers[k];
            }
            System.out.println(sum);
            System.out.println(numbers[0]);}
        }
    }
