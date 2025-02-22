//program to implement priority scheduling 
import java.lang.*;

 class one extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName()+" is running with priority "+Thread.currentThread().getPriority());
    }
 }

 public class priority_scheduling{
public static void main(String[] args) {
    one t1=new one();
    one t2=new one();
    one t3=new one();

    System.out.println("t1 thread priority:"+t1.getPriority());
    System.out.println("t2 thread priority:"+t2.getPriority());
    System.out.println("t3 thread priority:"+t3.getPriority());

    t1.setPriority(2);
    t2.setPriority(5);
    t3.setPriority(8);

    System.out.println("t1 thread priority:"+t1.getPriority());
    System.out.println("t2 thread priority:"+t2.getPriority());
    System.out.println("t3 thread priority:"+t3.getPriority());

    t1.setPriority(Thread.MIN_PRIORITY);
    t2.setPriority(Thread.NORM_PRIORITY);
    t3.setPriority(Thread.MAX_PRIORITY);

    t1.start();
    t2.start();
    t3.start();
}
}