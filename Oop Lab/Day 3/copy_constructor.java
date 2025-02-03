class item {
    int x;
    int y;

    item(int a,int b){
        x=a;
        y=b;
    }
}
class rect{
    int l;
    int w;
    rect(item ob){  //copy constructor
        l=ob.x;
        w=ob.y;
    }
    int area(){
        return l*w;
    }
}
public class copy_constructor{
    public static void main(String[] args) {
        item q=new item(10,50);
        rect r=new rect(q);                                      //copy constructor
        System.out.println("Area of the Rectangle: "+r.area());
    }
}