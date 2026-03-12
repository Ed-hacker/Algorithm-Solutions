import java.util.Arrays;
import java.util.LinkedList;

class Solution {
    public class Point{
        private Long x, y;

        public Long getX(){
            return x;
        }
        public Long getY(){
            return y;
        }
        Point(Long x, Long y){
            this.x = x;
            this.y = y;
        }
    }

    public String[] solution(int[][] line) {
        LinkedList<Point> pointArr = new LinkedList<>();

        for(int i = 0; i < line.length; i++){
            long x1 = line[i][0];
            long y1 = line[i][1];
            long c1 = line[i][2];

            for(int j = i + 1; j < line.length; j++){
                long x2 = line[j][0];
                long y2 = line[j][1];
                long c2 = line[j][2];

                if(x1 * y2 - x2 * y1 != 0){
                 double x = (double) (y1 * c2 - y2 * c1) / (x1 * y2 - x2 * y1);
                 double y =  (double) (x2 * c1 - x1 * c2) / (x1 * y2 - x2 * y1);  //왜 바꿔줌??

                if( x % 1 == 0 && y % 1 == 0)
                    pointArr.add(new Point((long)x,(long)y));
                }
            }
        }
        long maxX = Long.MIN_VALUE;
        long maxY = Long.MIN_VALUE;
        long minX = Long.MAX_VALUE;
        long minY = Long.MAX_VALUE;
        for( Point p : pointArr ){
            maxX = Math.max(maxX, p.getX());
            maxY = Math.max(maxY, p.getY());
            minX = Math.min(minX, p.getX());
            minY = Math.min(minY, p.getY());
        }

        char[][] map = new char [(int)(maxY-minY + 1)][(int)(maxX-minX + 1)];
        for(char[] row : map){
            Arrays.fill(row,'.');
        }

        for( Point P : pointArr ){
            map[Math.toIntExact(maxY - P.getY())][Math.toIntExact(P.getX() - minX)] = '*';
        }

        String[] result = new String[map.length];
        for(int i = 0; i< result.length; i++){
            result[i] = new String(map[i]);
        }

        return result;


    }
}