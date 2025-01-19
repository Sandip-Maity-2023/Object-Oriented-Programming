 class calculator {
    int a,b,c;
    int  add(){
return (a+b);
    }
int sub(){
    return (a-b);
    //System.out.println("a - b="+c);
}
    int mul(){
    return a*b;
        //System.out.println("a * b="+c);
    }
    int div(){
        if(b!=0){
            return a/b;
            //System.out.println("a / b="+c);
        }else{
            System.out.println("Not divisible");
        }
        return a;    
}
 }
  class cal{                        //File Name Matches public Class: If your public class is named Cal, the file should be named Cal.java.
                                   //Only One public Class: A Java file can have only one public class, and its name must match the file name.
    public static void main(String[] args) {
        
    
    calculator y=new calculator();
    y.a=5;
    y.b=6;
    System.out.println(y.add());
    System.out.println(y.sub());
    System.out.println(y.mul());
    System.out.println(y.div());
 }
 }