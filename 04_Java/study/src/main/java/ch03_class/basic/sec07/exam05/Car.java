package main.java.ch03_class.basic.sec07.exam05;

public class Car {
    // 필드 선언
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    // 생성자를 호출했으므로 자동으로 기본 생성자 생성X
    // 매개 변수 없는 Car() 호출 할 경우 컴파일 에러

    Car(String model) {
        // this.model = model;
        // System.out.println(model);
        // --> 소괄호를 사용하여 한번에 생성자 호출 가능
        this(model, "은색", 250);
    }

    Car(String model, String color) {
        //this.model = model;
        //this.color = color;
        this(model, color, 250);


    }

    Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }


}

