package main.java.ch04_Inheritance_polymorphism.basic.ch07.sec04.exam01;

public class ComputerExample {
    public static void main(String[] args) {

        Calculator cal = new Calculator();

        System.out.println("계산기로 구한 원의 면적: " + cal.areaCircle(10));

        Computer com = new Computer();
        System.out.println("컴퓨터로 구한 원의 면적: " + com.areaCircle(10));
    }
}
