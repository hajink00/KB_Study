package main.java.ch04_Inheritance_polymorphism.basic.ch07.sec07.exam02;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent = child;
        parent.method1();
        parent.method2();

        // parent.method3();
        // parent: 자식으로 객체를 만들었어도 참조 타입은 부모
        // class Parent에는 method3 미존재
        // 부모 타입 참조시에는 부모가 정의한 공통 기능만 사용할 수 있음

    }
}
