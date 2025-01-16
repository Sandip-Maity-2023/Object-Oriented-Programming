//this program uses commandline arguments as input
public class Comand_line_arguments {
    public static void main(String[] args) {
        int count,i=0;
        String string;
        count=args.length;
        System.out.println("Number of arguments="+count);
        while(i<count){
            string=args[i];
            i+=1;
            System.out.println(i+":"+"java is"+string+"!");
        }
    }
}
