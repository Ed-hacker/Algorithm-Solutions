import java.util.Scanner;
import java.lang.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double count = 0;
        double sum = 0;
        while(sc.hasNext()){
            String a = sc.next();//과목이름
            double time = sc.nextDouble(); //학점
            String st = sc.next(); //성적
            double grade = 0;

            if(st.equals("A+"))grade = 4.5;
            else if(st.equals("A0"))grade = 4.0;
            else if(st.equals("B+"))grade = 3.5;
            else if(st.equals("B0"))grade = 3.0;
            else if(st.equals("C+"))grade = 2.5;
            else if(st.equals("C0"))grade = 2.0;
            else if(st.equals("D+"))grade = 1.5;
            else if(st.equals("D0"))grade = 1.0;
            else if(st.equals("F"))grade = 0.0;
            else {
                  continue;}


            count += time; // 학점 더하기
            sum += time * grade; //총 합 더하기
        }
        System.out.println(sum/count);
    }
}
