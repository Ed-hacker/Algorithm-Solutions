import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = 6;
        if(N == 1) System.out.println("1");
        else{ int count = 0;
            N--;
            while(N > 0){
               N=  N- count*6;
               count++;
            }

            //6보다 작으면 그만   카운트해서 6씩 곱해서 뺴주자
            System.out.println(count);
        }
        }
    }
