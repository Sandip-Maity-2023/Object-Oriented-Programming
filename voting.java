//implement the concept of voting system in Oop 
class ex{
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
        ex y=new ex();
        y.set(15);
        y.get();
    }
}
