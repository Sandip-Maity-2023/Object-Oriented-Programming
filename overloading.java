
public class overloading {
    
        int a,b;
    
        int area(int a,int b){
            this.a=a;
            this.b=b;
            int z=this.a*this.b;
            System.out.println("Area of Rectangle:"+z);
                        return z;
        }
        void area(int a){
            this.a=a;
            int z=this.a*this.a;
            System.out.println("Area of Square:"+z);
        }

public static void main(String[] args) {
    overloading y=new overloading();

    y.area(5);
    y.area(4,5);

}
}