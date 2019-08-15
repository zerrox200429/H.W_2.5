package com.company;

import java.util.concurrent.CountDownLatch;

public class Guide extends Thread{
    private CountDownLatch latch;
    private int number;

    public Guide(CountDownLatch latch, int number) {
        this.latch=latch;
        this.number = number;
    }
    public void run(){
        try {
            System.out.println("Ждем туриста :"+number );


            latch.countDown();

            latch.await();
            System.out.println("Поехали !!!");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        }



        }


