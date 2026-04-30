package main.java.ch08_multithread.thread.ex2;

public class SleepThreadRun {
    public static void main(String[] args) {
        Thread sleep = new Thread(new SleepThread());

        sleep.start();
    }



}
