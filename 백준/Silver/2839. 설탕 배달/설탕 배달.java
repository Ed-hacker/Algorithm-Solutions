import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int N = sc.nextInt(); //킬로그램
            int maxFive = N/5; // 5키로  최대 개수
            boolean has = false;

            for(int i = maxFive; i >= 0; i-- ){ //i는 5키로 짜리 개수
                if((N-i*5)%3==0){ //5키로 짜리 뺀 게 3으로 나누어 떨어지면
                    System.out.println(i+(N-i*5)/3);
                    has = true;
                    break;
                }
            }

            if(!has) System.out.println(-1);




            }
        }



