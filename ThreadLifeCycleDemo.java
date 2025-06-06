class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running...");
        try {
            Thread.sleep(2000); // Timed Waiting
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
        System.out.println("Thread finished.");
    }
}

public class ThreadLifeCycleDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread(); // New state
        System.out.println("Thread state after creation: " + t1.getState());

        t1.start(); // Runnable → Running
        System.out.println("Thread state after start(): " + t1.getState());

        try {
            Thread.sleep(100); // Main thread sleep
            System.out.println("Thread state during sleep: " + t1.getState());

            t1.join(); // Waiting
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread state after completion: " + t1.getState()); // Terminated
    }
}
