import java.util.Scanner;

class Main { //인덱스를 타겟하고 똑같이 놓고 대상 - 인덱스 2보다 크면 브레이크+count하나 추가, 안 크면(연속이면) 인덱스 옮김
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        for(int i = 0; i < N; i++){
            String st = sc.next();
            for(int j = 0; j < st.length()-1; j++){
                char target = st.charAt(j); //abab -> a
                boolean check = false;
                int k = j+1; //1
                int index = j; //0
                while(k < st.length()){ //apple k++나중에 해줘야함
                    if(target == st.charAt(k)){
                        if(k-index >= 2){
                            check = true;
                            count++;
                            break;
                        }else index = k;
                    }
                    k++;
                }
                if(check)break;

                }
            }
        System.out.println(N-count);
        }





    }
