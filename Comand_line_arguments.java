//this program uses commandline arguments as input
public class Comand_line_arguments {
    public static void main(String[] args) {
        int i=0;
        int count=args.length;
        System.out.println("Number of arguments="+count);
        for(i=0;i<count;i++){
            String string=args[i];
            System.out.println( i +":"+"java is"+string+"!");
        }
    }
}
