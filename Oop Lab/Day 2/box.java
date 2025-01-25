public class box {
    int l,w,h;
    
    box(int a,int b,int c){
        l=a;
        w=b;
        h=c;
    }

    void area(){
int z=2*(l*w+w*h+h*l);
System.out.println("Surface area of Box:"+z);
    }

    void vol(){
       int v=l*w*h;
        System.out.println("Volume of the Box :"+v);
    }

    public static void main(String[] args) {
        box y=new box(10,20,30);
        y.area();
        y.vol();
    }
}
