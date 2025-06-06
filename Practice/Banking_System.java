package Practice;
public class Banking_System {

    double balance;
    String name;
    int account_no;
    String address;
    String phone_no;

    void deposit(double amount){
        balance+=amount;
        System.out.println("Amount Deposited:"+amount);
    }
    void withdraw(double amount){
        if(balance>=amount){
            balance-=amount;
            System.out.println("Amount Withdrawn:"+amount);
        }else{
            System.out.println("Insufficient Balance");
        }
    }
    void checkBalance(){
        System.out.println("Balance:"+balance);
    }
    void display(){
        System.out.println("Name:"+name);
        System.out.println("Account Number:"+account_no);
        System.out.println("Address:"+address);
        System.out.println("Phone Number:"+phone_no);
        System.out.println("Balance:"+balance);
    }
    void add_account(String n,int a,String ad,String p){
        name=n;
        account_no=a;
        address=ad;
        phone_no=p;
    }
    void transfer(Banking_System x,double amount){ ////////////???
        if(balance>=amount){
            balance-=amount;
            x.balance+=amount;
            System.out.println("Amount Transferred:"+amount);
        }else{
            System.out.println("Insufficient Balance");
        }
    }

    public static void main(String[] args) {
        
    }
}
