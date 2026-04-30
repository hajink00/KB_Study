package ch08.sec10.exam02;

public class CastingExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();
        vehicle.run();
        //vehicle.checkFare();
        // 인터페이스 Vehicle에는 checkFare() 메서드 존재 안함
        // --> Bus로 강재형번환 해주어야함

        Bus bus = (Bus) vehicle;
        bus.run();
        bus.checkFare();
    }
}
