package main.java.ch11_lambda.advanced;

public class Person {
    public void action(Calcuable calcuable) {
        double result = calcuable.calc(10, 4);
        System.out.println("결과: " + result);
    }
}
