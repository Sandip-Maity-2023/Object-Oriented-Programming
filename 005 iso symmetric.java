
class triangle {
    double h,l;
void area(){
    double a=0.5*l*h;
    System.out.println("area="+a);
}
}
class gx{                                   //in another program class name same with this so causing not showing this program out put
    public static void main(String[] args) {
        triangle x=new triangle();
        x.h=10;
        x.l=15;
        x.area();
    }
}