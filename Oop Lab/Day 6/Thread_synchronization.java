//Thread Synchrornization
class bankAccount{
    private int balance=1000;
    public synchronized void deposit(int amount){
        balance+=amount;
        System.out.println("Deposit:"+amount+" Balance:"+balance);

    }
    public synchronized void withdraw(int amount){
        if(balance>=amount){
            balance-=amount;
            System.out.println("Withdraw: "+amount+" Balance: "+balance);
        }
        else{
            System.out.println("Insufficient balance to withdraw: "+balance);
        }
    }
        public int getBalance(){
            return balance;
        }
    }
        public class Thread_synchronization{
        public static void main(String[] args) {
            bankAccount b=new bankAccount();
            Thread t1=new Thread(()-> {for(int i=0;i<3;i++){
                b.deposit(200);
                try {
                    Thread.sleep(2000);

                } catch ( InterruptedException e) {
                    e.printStackTrace();
                }
            }
            });
            Thread t2=new Thread(()->{ for(int i=0;i<3;i++){
                b.withdraw(100);
                try {
                    Thread.sleep(1000);

                } catch ( InterruptedException e) {
                    e.printStackTrace();
                }
            }
            });
            t1.start();
            t2.start();

            try{
                t1.join();
                t2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Final balance:"+b.getBalance());
        }
    }


                