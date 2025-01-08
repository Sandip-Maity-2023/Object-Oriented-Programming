 class calculator {
    int a,b,c;
    void add(){
c=a+b;
System.out.println("a + b="+c);
    }
void sub(){
    c=a-b;
    System.out.println("a - b="+c);
}
    void mul(){
        c=a*b;
        System.out.println("a * b="+c);
    }
    void div(){
        if(b!=0){
            c=a/b;
            System.out.println("a / b="+c);
        }else{
            System.out.println("Not divisible");
        }
        
}
 }
  class cal{                        //File Name Matches public Class: If your public class is named Cal, the file should be named Cal.java.
                                   //Only One public Class: A Java file can have only one public class, and its name must match the file name.
    public static void main(String[] args) {
        
    
    calculator y=new calculator();
    y.a=5;
    y.b=6;
    y.add();
    y.sub();
    y.mul();
    y.div();
 }
 }