class example {
    int x,y;

     example(int x1,int y1) {
        x=x1;
        y=y1;
    }
}
    class Rect{
        int l;
        int w;
        Rect(example ob){
            l=ob.x;
            w=ob.y;
        }
        int area(){
            return l*w;
        }
    }

    public class tiger{                            //where will be public before the class that name will take as a class name
        public static void main(String[] args) {
            example k1=new example(10,5);
            Rect k2=new Rect(k1);
            System.out.println("Area of rectangle is "+k2.area());
        }
    }
    
