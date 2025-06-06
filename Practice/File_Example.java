package Practice;
import java.io.File;
import java.io.IOException;

 public class File_Example {
public static void main(String[] args) throws IOException {
    File x;
    if(args.length>0){
        for(int i=0;i<args.length;i++){
            x=new File(args[i]);
            getPaths(x);
            getInfo(x);

        }
    }else
System.out.println("Usage: Java FileExample test<filename (s)>");
}    

public static void getPaths(File f) throws IOException{

System.out.println("Name: "+f.getName());
System.out.println("Path: "+f.getPath());
System.out.println("Parent: "+f.getParent());

}
public static void getInfo(File f) throws IOException {

    if(f.exists()){
        System.out.println("File exits");
        System.out.println(f.canRead() ? "and is readable:" :"");
        System.out.println(f.canWrite() ? "and is writable:" :"");
        System.out.println("File is last modified:"+f.lastModified());
        System.out.println("File is: "+f.length()+"bytes");
    }else{
        System.err.println("File does not exit.");
    }
} 
 }