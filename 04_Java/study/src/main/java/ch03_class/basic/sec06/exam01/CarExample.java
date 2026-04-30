package main.java.ch03_class.basic.sec06.exam01;

// 클래스 : 객체의 특성(속성과 기능)을 정의하는 설계도
public class CarExample {
    public static void main(String[] args) {
        // Car 객체 생성
        Car myCar = new Car();
        // Car에 기본 생성자가 작성되어 있지 않지만 문제 없이 사용 가능
        // 왜?
        // 컴파일러가 코드 번역 시
        // 클래스 내부에 생성자가 없는 경우
        // 자동으로 기본 생성자 추가

        // (주의) 생성자가 하나라도 있으면 자동 생성 안해줌!

        // Car 객체의 필드값 읽기
        System.out.println("모델명 : " + myCar.model);
        System.out.println("시동 여부 : " + myCar.start);
        System.out.println("현재 속도 : " + myCar.speed);

        System.out.println("바퀴 수 : " + myCar.wheel);
        System.out.println("바퀴 수 : " + Car.wheel);
        // static 필드/메서드는 "클래스명.필드명"
        // 혹은 "클래스명.메서드명()" 로 작성

        System.out.println("-----------------------------");

        // Car 객체의 메서드 호출

        myCar.drive();
        String intro = myCar.intro();
        System.out.println(intro);
        System.out.println(myCar.intro());
    }
}
