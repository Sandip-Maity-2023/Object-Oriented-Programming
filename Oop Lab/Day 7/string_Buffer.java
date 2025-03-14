public class string_Buffer {
    public static void main(String args[]){
        StringBuffer s=new StringBuffer();
        s.append("hello");
        s.append(" ");
        s.append("world"); //insert
String x=s.toString();
        System.out.println(x);

    }
}