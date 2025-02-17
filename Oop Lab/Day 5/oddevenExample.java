class oddThread extends Thread{
    public void run(){
        for(int i=1;i<=10;i+=2){
System.out.println("Odd Number: "+i);
try {
    Thread.sleep(1000);
} catch (InterruptedException e) {
    System.out.println(e);
}
        }
    }
}
class evenThread extends Thread{
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
public class oddevenExample{
    public static void main(String[] args) {
        oddThread x=new oddThread();
        evenThread y=new evenThread();

        x.start();
        y.start();
    }
}