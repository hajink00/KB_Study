package main.java.ch05_abstract_interface.advanced.ch08.sec11.exam01;

public class Car {
    // Tire 타입의 tire1, tire2 멤버변수 정의
    // 기본값으로 HankookTire 인스턴스로 정의
    Tire tire1 = new HankookTire();
    Tire tire2 = new HankookTire();

    // run() 메서드에서 각 멤버변수의 roll() 메서드 호출

    void run() {
        tire1.roll();
        tire2.roll();
    }
}
