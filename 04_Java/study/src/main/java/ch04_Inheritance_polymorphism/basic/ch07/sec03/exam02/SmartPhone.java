package main.java.ch04_Inheritance_polymorphism.basic.ch07.sec03.exam02;

public class SmartPhone extends Phone{
    public SmartPhone(String model, String color) {
        super(model, color);
        this.model = model;
        this.color = color;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
