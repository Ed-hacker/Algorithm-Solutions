import java.util.Scanner;
class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T =  sc.nextInt();
        for(int i = 0; i < T ; i++){
            int H = sc.nextInt(); // 층 수
            int W = sc.nextInt(); // 한 층의 방개수
            int N = sc.nextInt(); // N번째 손님

            int floorNumber = 0;
            // 6 12 10  10/6 = 1 -> 1(고정) + 1 // //10%6 = 4  0이면 6층! //
            int roomNumber = (N-1)/H + 1;

            if(N%H != 0)floorNumber = N%H;
            else floorNumber = H;
            System.out.println(floorNumber*100+roomNumber);

        }



        }
    }



