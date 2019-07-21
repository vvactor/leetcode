package com.vvz.dev;

public class Foo2 {
    private  boolean lock1;
    private  boolean lock2;
    private Object lock;

    public Foo2(){
        this.lock1 = false;
        this.lock2 = false;
        this.lock = new Object();
    }

    public void first(Runnable printFirst) throws InterruptedException {

        synchronized (lock) {
            // printFirst.run() outputs "first". Do not change or remove this line.
            printFirst.run();
            lock1 = true;
            lock.notifyAll();
        }
    }

    public void second(Runnable printSecond) throws InterruptedException {
        synchronized (lock) {
            while(!lock1){
                lock.wait();
            }
            // printSecond.run() outputs "second". Do not change or remove this line.
            printSecond.run();
            lock2 = true;
            lock.notifyAll();


        }
    }

    public void third(Runnable printThird) throws InterruptedException {
        synchronized (lock) {
            while(!lock2){
                lock.wait();
            }
            // printThird.run() outputs "third". Do not change or remove this line.
            printThird.run();

        }
    }

}
