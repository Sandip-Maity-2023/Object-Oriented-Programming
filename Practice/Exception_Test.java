package Practice;
 public class Exception_Test  {
    public static int j;
    static void main(String[] argh){
for(int i=0;i<4;i++){
    try {
        switch(i){
            case 0:
            int zero = 0;
            j=999/zero;
            break;
            case 1:
            int b[]=null;
            j=b[0];
            break;
            case 2:
            int[] c = new int[7];
            j=c[10];
            break;
            case 3:
            char ch="java".charAt(9);
            break;
        }
    } catch (Exception e) {
        System.out.println("In text case!"+i+"\n");
        System.out.println(e);
    }
}
    }
}
