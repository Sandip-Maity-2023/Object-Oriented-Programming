//implement the concept of voting system in Oop 
class ex1{
int age;

void set(int age){
    this.age=age;
}
void get(){
    if(age>=18){
        System.out.println("You are eligible");
    }else{
        System.out.println("You are NOT eligible");
    }
}
}
public class voting {
    public static void main(String[] args) {
        ex1 y=new ex1();
        y.set(15);
        y.get();
    }
}
