import java.util.*;
public class vector {
public static void main(String[] args) {
    int sum=0;
    float avg=0;
    ArrayList<Integer> l=new ArrayList<Integer>();
    System.out.println("Enter the Input:");
    Scanner sc=new Scanner(System.in);
    while(sc.hasNextInt()){
        l.add(sc.nextInt());
    }
    for(int i=0;i<l.size();i++){
sum+=l.get(i);
    }
    avg=sum/l.size();
    System.out.println("Average:"+avg);

}    
}
