//java program for student marksheet generation
import java.util.Scanner;

class student{
int roll;
float sub1,sub2,sub3,total,avg;

student(){
roll=0;
sub1=0;sub2=0;sub3=0;total=0;avg=0;String s;
Scanner x=new Scanner(System.in);
System.out.println("Enter the roll number of the student");
roll=x.nextInt();

System.out.println("Enter name of student:");
s=x.nextLine();
x.next();  //it matters
System.out.println("Enter the marks of subject 1");
sub1=x.nextFloat();

System.out.println("Enter the marks of subject 2");
sub2=x.nextFloat();

System.out.println("Enter the marks of subject 3");
sub3=x.nextFloat();


System.out.println("The roll number of the student is:"+roll);
System.out.println("The name of the student is:"+s);
System.out.println("The marks of subject 1 is:"+sub1);
System.out.println("The marks of subject 2 is:"+sub2);
System.out.println("The marks of subject 3 is:"+sub3);

total=sub1+sub2+sub3;
avg=total/3;
System.out.println("The total marks of the student is:"+total);
System.out.println("The average marks of the student is:"+avg);
x.close();
}

student(int r,float s1,float s2,float s3){
    roll=r;
    sub1=s1;
    sub2=s2;
    sub3=s3;
}

}
public class Object_creation{
    public static void main(String args[]){
        student x1=new student();
        student y1=new student(2,76,79,87);
    }
}