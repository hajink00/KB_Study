package main.java.ch08_multithread.basic.ch14.sec03.exam02;

import main.java.ch08_multithread.thread.ex1.SecondThread;

public class BeepPrintExample {
    public static void main(String[] args) {

        Thread beep = new Thread(new BeepPrint());

        beep.start();

            // main thread
            Thread main = new Thread();

        for(
            int i = 0;
            i< 10;i++)

            {
                System.out.println("띵");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }
