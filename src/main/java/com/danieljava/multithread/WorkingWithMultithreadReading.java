package com.danieljava.multithread;

public class WorkingWithMultithreadReading {
    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 5; i++) {
//          MultithreadingThing myThing = new MultithreadingThing(i);
            MultithreadingThingRunnable myThing = new MultithreadingThingRunnable(i);
            Thread mythread = new Thread(myThing);
//          myThing.start();
            mythread.start();
//          El metodo .join() hace que se espere hasta que el thread se ejecute para seguir con la siguiente linea
            mythread.join();
//          mythread.isAlive();
        }
    }
}

