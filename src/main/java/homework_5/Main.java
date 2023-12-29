package homework_5;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class Main {
    static CountDownLatch eat1 = new CountDownLatch(5);
    static CountDownLatch eat2 = new CountDownLatch(5);
    static CountDownLatch eat3 = new CountDownLatch(5);
    static String eatBefore;
    static final Object fork = new Object();
    static final Random random = new Random();

    public static void main(String[] args) throws InterruptedException {

        Thread ph1 = new Thread(new Philosopher("Аристотель "));
        Thread ph2 = new Thread(new Philosopher("Платон "));
        Thread ph3 = new Thread(new Philosopher("Деметрий "));
        Thread ph4 = new Thread(new Philosopher("Теофраст "));
        Thread ph5 = new Thread(new Philosopher("Пифагор "));


        ph1.start();
        ph2.start();
        ph3.start();
        ph4.start();
        ph5.start();
    }
}
