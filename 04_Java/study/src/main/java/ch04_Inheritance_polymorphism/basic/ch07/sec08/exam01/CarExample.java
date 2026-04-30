package main.java.ch04_Inheritance_polymorphism.basic.ch07.sec08.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car mycar = new Car();
        // class Car에는 필드에 tire(클래스: Tire) 변수만 선언 되어있음
        // 자동초기활 null 값 들어있음
        // mycar.run();
        // --> mycar 안의 tire에는 null 값만 들어있으므로(참조형 변수 자동초기화)
        //     run() 출력 불가
        //     new로 객체 생성 해줘야함
        mycar.tire = new Tire();
        mycar.run();

        // 참조하는 데이터 주소를 계속 바꿔줌
        mycar.tire = new HankookTire();
        mycar.run();

        mycar.tire = new KumhoTire();
        mycar.run();




    }
}
