package ru.kpfu.itis.minsafin.aivar.homework.hw_1;

public class MainHw1 {
    public static void main(String[] args) {
        ThreadPool threadPool = new ThreadPool(3);
        Runnable runnable = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(5 + " " + Thread.currentThread());
            }
        };
        Runnable runnable2 = () -> {
            for (int i = 0; i < 300; i++) {
                System.out.println(22 + " " + Thread.currentThread());
            }
        };
        Runnable runnable3 = () -> {
            for (int i = 0; i < 300; i++) {
                System.out.println(333 + " " + Thread.currentThread());
            }
        };
        Runnable runnable4 = () -> {
            for (int i = 0; i < 300; i++) {
                System.out.println(4444 + " " + Thread.currentThread());
            }
        };
        Runnable runnable5 = () -> {
            for (int i = 0; i < 300; i++) {
                System.out.println("fifth" + " " + Thread.currentThread());
            }
        };
        threadPool.submit(runnable);
        threadPool.submit(runnable2);
        threadPool.submit(runnable3);
        threadPool.submit(runnable4);
        threadPool.submit(runnable5);
    }
}
