package main.java.ch01_variable_type_operator.basic.ch04.sec04;

public class SumFrom1To100Example2 {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;
        while (num <=100){
            sum = sum + num;
            num++;
        }
        System.out.println("1~100 합: " +sum);
    }
}
