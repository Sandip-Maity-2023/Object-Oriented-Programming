class program{
 private String name;
 public String getName(){return name;}
 public void setName(String name){
    this.name=name;  //to avoid naming conflict
 }
}
public class encapsulation {
    public static void main(String[] args) {
        program p=new program();
        p.setName("Geek");
        System.out.println("Name=> "+p.getName());
    }
}
