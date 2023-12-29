package homework_5;

import java.util.Objects;
import java.util.concurrent.CountDownLatch;

import static homework_5.Main.*;

public class Philosopher implements Runnable{
    String name;

    public Philosopher(String name) {

        this.name = name;

    }

    @Override
    public void run() {
        try {
            Thread.sleep(random.nextInt(10));
            eat(eat1, " завтракает...");
            skipWhoEatBefore();
            eat(eat2, " ужинает...");
            skipWhoEatBefore();
            eat(eat3, " обедает...");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void eat(CountDownLatch count, String eating) throws InterruptedException {
        synchronized (fork) {
            eatBefore = name;
            System.out.println(name + eating);
            Thread.sleep(500);
            System.out.println(name + "думает... ");
        }
        count.countDown();
        count.await();
    }

    public void skipWhoEatBefore() throws InterruptedException {

        while (Objects.equals(eatBefore, name)) {
            Thread.sleep(1);
        }
    }
}

