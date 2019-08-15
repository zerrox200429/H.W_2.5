package com.company;

import java.util.concurrent.CountDownLatch;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        CountDownLatch latch = new CountDownLatch(15);
        for (int i = 1; i <= 15; i++) {
            Guide guide = new Guide(latch, i);
            guide.start();
            Thread.sleep(500);
            guide.stop();
        }


    }
}
