import java.util.Scanner;

class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();//시간
        int min = sc.nextInt();//분
        int time = sc.nextInt(); //걸리는 분
        int allmin =  hour*60+min+time;
        if(allmin>=1440){//다음날로 넘어가면
            int truemin = allmin-1440;
            int a = truemin / 60;
            int b = truemin % 60;
            System.out.println(a + " " + b);
        }else{
            int a = allmin / 60;
            int b = allmin % 60;
            System.out.println(a + " " + b);

        }


        }






    }

