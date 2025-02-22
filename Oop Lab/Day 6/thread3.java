
class A implements Runnable{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Number: "+i);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}

//Step 1: Implementing the Runnable interface
class MyRunnable implements Runnable {
 @Override
 public void run() {
     // This is the code that will be executed in the thread
     for (int i = 1; i <= 5; i++) {
         System.out.println("Number: " + i);
         try {
             // Simulating some work with a delay
             Thread.sleep(1000); // Sleep for 1 second
         } catch (InterruptedException e) {
             System.out.println(e);
         }
     }
 }
}

public class thread3 {
 public static void main(String[] args) {
     // Step 2: Create an instance of the class that implements Runnable
     MyRunnable myRunnable = new MyRunnable();

     // Step 3: Create a Thread object and pass the Runnable object to it
     Thread myThread = new Thread(myRunnable);

     // Step 4: Start the thread
     myThread.start();

     // Main thread will continue running independently of the above thread
     System.out.println("Main thread is running...");

     // Optionally, you can join the main thread to wait for the completion of the child thread
     try {
         myThread.join(); // Wait for the myThread to finish
     } catch (InterruptedException e) {
         System.out.println(e);
     }

     System.out.println("Main thread finished.");
 }
}