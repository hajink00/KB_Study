package main.java.ch08_multithread.basic.ch14.exam;

public class ThreadExample {
    public static void main(String[] args) {
        // MovieThread (Thread 상속)
        MovieThread movie = new MovieThread();

        // MusicThread (Runnable)
        Thread music = new Thread(new MusicRunnable());

        movie.start();
        music.start();
    }
}
