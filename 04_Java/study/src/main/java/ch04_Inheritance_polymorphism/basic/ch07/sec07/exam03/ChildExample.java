package main.java.ch04_Inheritance_polymorphism.basic.ch07.sec07.exam03;

public class ChildExample {
    public static void main(String[] args) {
        // 부모 참조 객체 생성
        Parent parent = new Child();

        parent.field1 = "data1";
        parent.method1();
        parent.method2();
        //parent.field2 = "data2"; // parent에는 field2 미존재
        //parent.method3(); // parent에는 method3 미존재

        // parent를 Child 타입으로 강제 형변환
        Child child = (Child) parent;

        child.field2 = "data2";
        child.method3();
    }
}
