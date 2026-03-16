class Solution {
    private static final int[] dx = {-1, 1,0 ,0 };
    private static final int[] dy = {0, 0, 1, -1}; //상하좌우

    static int check(String[] arr){
        char[][] room = new char[5][5];
        for(int i = 0; i < 5; i++ ){
            for(int j = 0; j < 5; j++){
                room[i][j] = arr[i].charAt(j);
            }
        }

        for(int x = 0; x < 5; x++ ){
            for(int y = 0; y < 5; y++) {
                if (room[x][y] == 'P') {
                    for (int k = 0; k < 4; k++) {
                        int nx = x + dx[k];
                        int ny = y + dy[k];
                        if (nx < 0 || nx > 4 || ny < 0 || ny > 4) continue;

                        if (room[nx][ny] == 'P') return 0;
                        else if (room[nx][ny] == 'O') {
                            for (int i = 0; i < 4; i++) {
                                int nnx = nx + dx[i];
                                int nny = ny + dy[i];
                                if (nnx < 0 || nnx > 4 || nny < 0 || nny > 4) continue;
                                if (nnx == x && nny == y) continue;

                                if (room[nnx][nny] == 'P') return 0;
                            }
                        }
                    }
                }
            }
        }

        return 1;
    }




    public int[] solution(String[][] places) {
        int[] answer = new int[5];
        for(int i = 0; i < 5; i++){
            answer[i] = check(places[i]);
        }


        return answer;
    }
}