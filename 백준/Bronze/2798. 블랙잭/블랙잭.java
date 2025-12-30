import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int N = sc.nextInt(); //카드 개수
            int M = sc.nextInt(); //대상 숫자
            int[] deck = new int [N];
            for(int i = 0; i < N; i++) {
                deck[i] = sc.nextInt();
            }

            int result = 0; //현재까지 블랙잭 최대 합
            int sum = 0; // 더한거 넣어주는 변수

            for(int j = 0; j < N-2; j++){//제일 처음 숫자
                for(int k = 1; k < N-1; k++){
                    for(int l = 2; l < N; l++){
                        if(j != k && j!=l &&k!=l) {
                            sum = deck[j] + deck[k] + deck[l];
                            if (M - sum >= 0 && M - result >= M - sum) {
                                result = sum;
                            }
                        }
                    }
                }
            }

        System.out.println(result);



        }

    }