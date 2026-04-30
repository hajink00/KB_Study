package main.java.ch03_class.basic.sec07.exam04;

public class Car {
//필드선언
public String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;
// 생성자
    public Car(){
        System.out.println("car1.company : " + company);
    }
    public Car(String model){
        System.out.println("car2.company : " + company);
        System.out.println("car2.model : " + model);
    }
    public Car(String model, String color){
        System.out.println("car3.company : " + company);
        System.out.println("car3.model : " + model);
        System.out.println("car3.color : " + color);

    }
    public Car(String model, String color, int maxSpeed){
        System.out.println("car4.company : " + company);
        System.out.println("car4.model : " + model);
        System.out.println("car4.color : " + color);
        System.out.println("car4.maxSpeed : " + maxSpeed);

    }


}

