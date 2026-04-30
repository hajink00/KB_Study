package main.java.ch05_abstract_interface.advanced.ch08.sec11.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car();

        car.run();

        // 객체 금호타이어로 바꿔주기

        car.tire1 = new KumhoTire();
        car.tire2 = new KumhoTire();

        car.run();


    }
}
