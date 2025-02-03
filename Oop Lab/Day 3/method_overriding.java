//where three classes are overriding the method of a parent class.    
//Creating a parent class.    
class Bank{    
    int get(){return 0;}    
    }    
    //Creating child classes.    
    class SBI extends Bank{    
    int get(){return 8;}    
    }    
        
    class ICICI extends Bank{    
    int get(){return 7;}    
    }    
    class AXIS extends Bank{    
    int get(){return 9;}    
    }    
      
    public class method_overriding{    
    public static void main(String args[]){    
        
    SBI s=new SBI();    
    ICICI i=new ICICI();    
    AXIS a=new AXIS();    
    
    System.out.println("SBI Rate of Interest: "+s.get());    
    System.out.println("ICICI Rate of Interest: "+i.get());    
    System.out.println("AXIS Rate of Interest: "+a.get());    
    }    
    }