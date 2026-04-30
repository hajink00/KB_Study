package ch04.sec02;

public class IfElseExample {
    public static void main(String[] args) {
        //int score = 85;
        int score = 93;


        if ( score < 90 ) {
            // score가 85인 경우
            System.out.println("점수가 90보다 작습니다.");
            System.out.println("등급이 B입니다.");
        } else {
            // score가 93인 경우
            System.out.println();
            System.out.println("점수가 90보다 높습니다.");
            System.out.println("등급이 A입니다.");
        }
    }
}
