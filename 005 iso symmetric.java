
class triangle {
    private double h,l;
    void set(double l1,double l2){
h=l1;
l=l2;
    }
void area(){
    double a=0.5*l*h;
    System.out.println("area="+a);
}
}
class gx{                                   //in another program class name same with this so causing not showing this program out put
    public static void main(String[] args) {
        triangle x=new triangle();
        x.set(10,20);
        x.area();
  }
}