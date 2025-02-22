// Java program to implement  thread life cycle (states of thread:new->runnable->running->blocked/waiting->terminated)

class thread implements Runnable 
{
      // Overriding the run method
      //@Override
    public void run()
    {
        // Moving thread2 to timed waiting state
        try {
            Thread.sleep(1500);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("State of thread1 while it called"+ " join() method on thread2 -"+ Test.thread1.getState());
        
          try {
            Thread.sleep(200);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Test implements Runnable {
    public static Thread thread1;
    public static Test p;

      // Overriding the run method
      @Override
      public void run()
    {
        thread x = new thread();
        Thread y = new Thread(x);

        // thread2 created and is currently in the NEW
        // state.
        System.out.println("State of thread2 after creating it - "+ y.getState());
      
        y.start();

        // thread2 moved to Runnable state
        System.out.println("State of thread2 after calling .start()" + " method on it - " + y.getState());

        // moving y to timed waiting state
        try {
            // moving thread2=y to timed waiting state
            Thread.sleep(200);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
      
        System.out.println("State of thread2 after calling .sleep()" + " method on it - " + y.getState());

        try {
            // waiting for thread2 to die
            y.join();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
      
        System.out.println("State of thread2 when it has finished "+ "it's execution - " + y.getState());
    }
  
    public static void main(String[] args)
    {
        p = new Test();
        thread1 = new Thread(p);

        // thread1 created and is currently in the NEW
        // state.
        System.out.println("State of thread1 after creating it - "+ thread1.getState());
      
        thread1.start();

        // thread1 moved to Runnable state
        System.out.println("State of thread1 after calling .start()"+ " method on it - " + thread1.getState());
    }
}
