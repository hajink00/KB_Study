package main.java.ch08_multithread.basic.ch14.sec03.exam03;

public class BeepPrintExample {
    public static void main(String[] args) {


        Thread thread = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("비프음 출력");
                    try {
                        sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
thread.start();

        // main thread
        Thread main = new Thread();

        for (int i = 0; i < 10; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        }
    }

