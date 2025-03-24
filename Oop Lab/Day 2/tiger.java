

    public class tiger{                            //where will be public before the class that name will take as a class name
        public static void main(String[] args) {
            exa k1=new exa(10,5);
            abc k2=new abc(k1);
            System.out.println("Area of rectangle is "+k2.area());
        }
    }
    class exa {
        int x,y;
        exa(int x1,int y1) {
            x=x1;
            y=y1;
        }
    }
    class abc{
        int l;
        int w;
        abc(exa ob){
            l=ob.x;
            w=ob.y;
        }
        int area(){
            return l*w;
        }
    }
