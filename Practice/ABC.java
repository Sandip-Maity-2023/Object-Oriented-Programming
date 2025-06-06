package Practice;
 class xyz extends Exception {
    public xyz(String x){
        super(x);
    }
    }
    public class ABC{
static void hello(int p,int a) throws xyz{
    if(p<60 || a<18){
    throw new xyz("Not eligible");
}else{
    System.out.println("Eligible");
}
    }
    
    public static void main(String[] args) {
        try {
            int p=77;
            int a=23;
            hello(p,a);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
