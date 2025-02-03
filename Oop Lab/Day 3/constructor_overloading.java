class Box{
int length,width,height;

Box(int l,int w,int h){
    length=l;
    width=w;
    height=h;
}
Box(){
    length=width=height=90;
}
Box(int len){
    width=length=height=len;
}
int volume(){
    return length*width*height;
}
}
public  class constructor_overloading{
    public static void main(String[] args) {
        Box x=new Box(10,20,30);
        Box y=new Box(5);
        Box z=new Box();
        int vol;
        vol=x.volume();
        System.out.println("Volume of Box: "+vol+" cubic unit");
        vol=y.volume();
        System.out.println("Volume of Box: "+vol+" cubic unit");
        vol=z.volume();
        System.out.println("Volume of Box: "+vol+" cubic unit");
    }
}