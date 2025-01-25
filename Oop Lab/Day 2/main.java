class Rect{
    int a;
    int b;

    //constructor
  Rect(int x,int y){
        a=x;
        b=y;
    }
    void area(){
        int q=a*b;
        System.out.println("Area :"+q);
    }

public static void main(String[] args){
    Rect x=new Rect(20, 15);
    x.area();
}
}