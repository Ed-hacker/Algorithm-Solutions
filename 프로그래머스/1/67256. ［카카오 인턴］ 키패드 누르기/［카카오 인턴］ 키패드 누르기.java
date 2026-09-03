class Solution {
    static class Point{
        int x;
        int y;
        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    public Point returnPoint(int number){
        if(number == 0) {
            return new Point(3, 1);}//행과 열
        else if(number == 10) {
            return new Point(3, 0);
        }
        else if(number == 11){
            return new Point(3,2);
        }
        else{
            return new Point((number-1)/3, (number-1) % 3 );
        }
    } //숫자를 좌표로 변환하는 메서드


    public int checkDistance(int numbers, int now){
        Point numberPoint = returnPoint(numbers);
        Point nowPoint = returnPoint(now);

        return Math.abs(nowPoint.x - numberPoint.x) + Math.abs(nowPoint.y - numberPoint.y);
    }//거리 측정해주는 메서드

    public String compareDistance(int left, int right, int next, String hand){
        int leftDistance = checkDistance(next, left);
        int rightDistance = checkDistance(next,right);

        if(leftDistance == rightDistance){
            if(hand.equals("right")){
                return "R";
            }
            else return "L";
        }else if(leftDistance < rightDistance){
            return "L";
        }else return "R";
    }


    public String solution(int[] numbers, String hand) {
        int left = 10;
        int right = 11; //라고 가정

        StringBuilder sb = new StringBuilder();

        for(int a : numbers){
            if(a % 3 == 1){ //1,4,7일때
                sb.append("L");
                left = a;
            }else if(a % 3 == 0 && a != 0){
                sb.append("R");
                right = a;
            }else{
                String now = compareDistance(left,right,a,hand);
                if(now.equals("R")) right = a;
                else left = a;

                sb.append(now);
            }
        }

        return sb.toString();
    }
}