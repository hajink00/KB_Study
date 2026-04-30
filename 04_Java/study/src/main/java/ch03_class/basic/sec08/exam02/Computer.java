package main.java.ch03_class.basic.sec08.exam02;

public class Computer {
    // int 반환하는 메소드 선언
    int sum(int ... values){ // ...values : 가변길이의 매개변수
        int sum = 0; // sum 변수 선언 및 초기화

        // values : 배열 타입 변수처럼 사용
        for (int i = 0;  i <values.length ; i++) {
            sum += values[i];
        }
        // 결괏값 리턴
        return sum;
    }
}
