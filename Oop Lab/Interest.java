public class Interest {
    int p,r,t;
    void get(int p,int r,int t){
        this.p=p;
        this.r=r;
        this.t=t;
    }
    void simple(){
        double si=(p*r*t)/100;
        System.out.println("Simple Interest:"+si);
    }
    void compound(){
        double ci=p*Math.pow((1+r/100),t);
        System.out.println("Compound Interest:"+ci);
    }

}
class in{
    public static void main(String[] args) {
        Interest x=new Interest();
        x.get(1000,5,2);
        x.simple();
        x.compound();
    }
}
