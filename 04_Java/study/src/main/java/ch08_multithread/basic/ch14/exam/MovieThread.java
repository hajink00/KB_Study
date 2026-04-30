package main.java.ch08_multithread.basic.ch14.exam;

// 1. thread 클래스 정의 (Thread 클래스 싱속)
public class MovieThread extends Thread{

    // 1초 간격을 "동영상을 재생합니다,"를 3회 출력하는 스레드 클래스 정의

    // 2. run() 메서드 오버라이드
    @Override
    public void run(){

        // 3. 1초 간격으로 3회 출력
        for (int i = 0; i < 3; i++) {

            System.out.println("동영상을 재생합니다.");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
