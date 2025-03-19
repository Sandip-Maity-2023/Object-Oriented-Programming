import java.util.StringTokenizer;
 public class String_Tokenizer {
public static void main(String[] args) {
	String s="hello how are you";
	StringTokenizer x=new StringTokenizer(s," ");
	while(x.hasMoreTokens()) {
		System.out.println(x.nextToken());
	}
}    
}