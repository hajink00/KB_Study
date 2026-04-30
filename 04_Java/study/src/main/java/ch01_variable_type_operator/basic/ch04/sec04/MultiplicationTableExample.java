package main.java.ch01_variable_type_operator.basic.ch04.sec04;

public class MultiplicationTableExample {
    public static void main(String[] args) {
        // 구구단
        for (int i = 2; i < 10 ; i++) {
            System.out.println("*** " + i + "단 ***");
            // 각 단
            for (int j = 1; j <10 ; j++) {
                int mulitple = i * j;
                System.out.println(i + " x " + j +" = " + mulitple);

            }
        }
    }
}
