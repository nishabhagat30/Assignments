class MyThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running");

        // Sleep method
        try {
            System.out.println(Thread.currentThread().getName() + " is sleeping...");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " was interrupted!");
        }

        System.out.println(Thread.currentThread().getName() + " finished execution");
    }
}

class MyRunnable implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running a Runnable task");
    }
}


public class Multithreading {
    public static void main(String[] args) {
        // Creating threads using Thread class
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        // Creating threads using Runnable interface
        Thread thread3 = new Thread(new MyRunnable());

        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();

        // join() method
        try {
            thread1.join(); // Main thread waits for thread1 to finish
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        // Yield method
        Thread.yield();

        // Priority methods
        thread1.setPriority(Thread.MIN_PRIORITY); // Priority 1
        thread2.setPriority(Thread.MAX_PRIORITY); // Priority 10
        System.out.println(thread1.getName() + " Priority: " + thread1.getPriority());
        System.out.println(thread2.getName() + " Priority: " + thread2.getPriority());

        // isAlive method
        System.out.println("Is " + thread1.getName() + " alive? " + thread1.isAlive());
        System.out.println("Is " + thread2.getName() + " alive? " + thread2.isAlive());

        // Interrupt method
        thread2.interrupt();

       
    }
}
