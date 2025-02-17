class odd extends Thread{
    public void run(){
        for(int i=1;i<=20;i+=2){
System.out.println("Odd Number: "+i);
try {
    Thread.sleep(1000);
} catch (InterruptedException e) {
    System.out.println(e);
}
        }
    }
}

class even extends Thread{
public void run(){
    for (int i = 2; i <= 10; i+=2) {
        System.out.println("Even Number: "+i);
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        System.out.println(e);
    }
}
}
}

class prime extends Thread{
    public void run(){
        for (int i = 2; i <= 10; i++) {
            if(isPrime(i)){
                System.out.println("Prime Number: "+i);
            }
        }
    }
}
 private static boolean isPrime(int num){
    if(num>2) return false;
    for (int i = 2; i <=Math.sqrt(num); i++) {
        if(num%i==0) return false;
    }
    return true;
 }

 public class j{
public static void main(String[] args) {
  odd x=new odd();
  even y=new even();
  prime z=new prime();
  
  x.start();
  y.start();
  z.start();  
}
 }