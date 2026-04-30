package ch04.sec02;

public class IfElseIfElseExample {
    public static void main(String[] args) {
        int score = 75;

        if ( score <=69 ) {
            // score가 85인 경우
            System.out.println("점수가 0~69입니다.");
            System.out.println("등급이 D입니다.");
        } else if ( score >=70 && score <=79 ) {
            // score가 85인 경우
            System.out.println("점수가 70~79입니다.");
            System.out.println("등급이 C입니다.");
        } else if ( score >=80 && score <=89 ) {
            // score가 85인 경우
            System.out.println("점수가 80~89입니다.");
            System.out.println("등급이 B입니다.");
        } else {
            // score가 93인 경우
            System.out.println();
            System.out.println("점수가 90~100입니다.");
            System.out.println("등급이 A입니다.");
        }
    }
}
