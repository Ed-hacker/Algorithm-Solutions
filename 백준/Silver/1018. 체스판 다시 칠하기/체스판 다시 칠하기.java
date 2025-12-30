import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int N = sc.nextInt(); //행
            int M = sc.nextInt(); //열
            char [][] total = new char[N][M]; //전체 행렬
            for(int x = 0; x < N; x++){
                String a = sc.next();
                for(int y = 0;y < M; y++){
                    total[x][y] = a.charAt(y);
                }
            }
            int min = 32;  //최대값


            //기준점이 될 수 있는 모든 점 대상
            for(int i = 0; i <= N-8; i++){ //인덱스로 들어감
                for(int j = 0; j <= M-8; j++){ //가능한 점들 다 추림
                    int count = 0; //점마다 카운트 초기화

                for(int k = i; k <= i+7; k++){//행에 들어갈 인덱스가 k
                    for(int l = j; l <= j+7; l++){
                        if(( (i+j)%2 == (k+l)%2 ) && (total[i][j] != total[k][l])) count++; //같아야하는데 다른거
                        else if(( (i+j)%2 != (k+l)%2 ) && (total[i][j] == total[k][l]))count++; //달라야하는데 같은거
                    }
                }

                min = Math.min(64-count,Math.min(min,count));

                }
            }
        System.out.println(min);
        }

    }

