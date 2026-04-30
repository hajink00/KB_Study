package main.java.ch08_multithread.basic.ch14.exam;

// 1. thread 클래스 정의 (Runnable 인터페이스 싱속)
public class MusicRunnable implements Runnable{
    
    // 1초 간격을 "음악을 재생합니다,"를 3회 출력하는 스레드 클래스 정의

    // 2. run() 메서드 오버라이드
    @Override
    public void run(){
        // 0.5초 간격 6회 출력
        for (int i = 0; i < 6; i++) {
            System.out.println("음악을 재생합니다.");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
