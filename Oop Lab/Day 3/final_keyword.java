public class final_keyword{
   //final  int a=10;  //this the heart line of program
    int b=20;
void get(int a,int b){
    //this.a=a;
    this.b=b;
    System.out.println("a="+a+" b="+b);
}
public static void main(String[] args) {
    final_keyword k=new final_keyword();
    k.get(30,40);
    //System.out.println("a="+k.a+" b="+k.b+"");
}
}