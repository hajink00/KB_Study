package main.java.ch03_class.basic.sec08.exam02;

public class ComputerExample {
    public static void main(String[] args) {
        Computer myCom = new Computer(); //Computer 객체 생성

        // ... values 매개 변수 지정
        // 1. 속성 값을 여러개 입력(일반 매개 변수랑 동일)
        int result1 = myCom.sum(1, 2, 3);
        System.out.println("result1: " + result1);

        int result2 = myCom.sum(1, 2, 3, 4, 5);
        System.out.println("result2: " + result2);

        // 2. 배열 생성 후 해당 배열을 넣어줌
        int[] values = {1, 2, 3, 4, 5};
        int result3 = myCom.sum(values);
        System.out.println("result3: " + result3);

        // 3. 매개변수 자리에서 바로 배열 생성 후 즉시 대입
        int result4 = myCom.sum(new int[]{1, 2, 3, 4, 5});
        System.out.println("result4: " + result4);
    }
}
