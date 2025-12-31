import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            String N = sc.next(); //216
            int number = Integer.parseInt(N); //216 숫자로
            boolean find = false;

            for(int j = 0; j < number; j++){
                int sum = j;//일단 j 더 함
                int a = j;
            for(int i = 0; i < String.valueOf(j).length(); i++){ //자릿수만큼 할거임
                sum += a%10;
                a /= 10;
                }
                if(number == sum){ System.out.println(j);
                    find = true;
                break;}
            }

            if(!find) System.out.println(0);





            }
        }



