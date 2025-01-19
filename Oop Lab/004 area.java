class circle{
    double r;
    void area(){
        double a=3.14*r*r;
        System.out.println("area="+a);
    }
    void peri(){
        double p=2*3.14*r;
        System.out.println("perimeter:"+p);
    }
}
class ex{
    public static void main(String[] args) {
        circle x=new circle();
        x.r=6;
        x.area();
        x.peri();
    }
}