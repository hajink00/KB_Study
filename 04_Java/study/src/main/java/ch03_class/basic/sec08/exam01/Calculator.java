package main.java.ch03_class.basic.sec08.exam01;

public class Calculator {

    // void -> return 값 없는 메소드 선언
   void powerOn(){
       System.out.println("전원을 켭니다.");
   }
   void powerOff(){
       System.out.println("전원을 끕니다.");
   }

   // 호출 시 두 정수 값 받음(매개변수), 호출한 곳으로 int return
   int plus(int x, int y){
       int result = x + y ;
        return result;
   }

   // 결과값 double return
    double divide (int x, int y) {
        double result = (double) x / (double) y;
        return result;
    }
}
