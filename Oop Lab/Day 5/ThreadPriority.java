class A extends Thread {
    public void run() {
        for (int i = 0; i <= 4; i++) {
            System.out.println("Thread A started");
        }
        System.out.println("Exit from A");
    }
}

class B extends Thread {
    public void run() {
        for (int j = 1; j <= 5; j++) {
            System.out.println("Thread B started");
        }
        System.out.println("Exit from B");
    }
}

class C extends Thread {
    public void run() {
        for (int k = 1; k <= 3; k++) {
            System.out.println("Thread C started");
        }
        System.out.println("Exit from C");
    }
}

public class ThreadPriority {
    public static void main(String[] args) {
        A x = new A();
        B y = new B();
        C z = new C();

        x.setPriority(Thread.MAX_PRIORITY);  // 10
        y.setPriority(Thread.NORM_PRIORITY + 1); // Default priority (5) + 1 = 6
        z.setPriority(Thread.MIN_PRIORITY);  // 1

        System.out.println("Start thread A");
        x.start();
        System.out.println("Start thread B");
        y.start();
        System.out.println("Start thread C");
        z.start();
    }
}
