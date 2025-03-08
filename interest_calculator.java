import java.io.DataInputStream;

public class interest_calculator {
    public static void main(String[] args) {
        Float principalAmount=new Float(0);
        Float rateOfInterest=new Float(0);
        int numberOfYears=0;
        try{
            DataInputStream in =new DataInputStream(System.in);
            String tempString;
            System.out.println("Enter Principal Amount:");
            System.out.flush();
            tempString=in.readLine();
            principalAmount=Float.valueOf(tempString);
            System.out.println("Enter rate of Interest:");
            System.out.flush();
            tempString=in.readLine();
            rateOfInterest=Float.valueOf(tempString);
            System.out.println("Enter number of Years:");
            System.out.flush();
            tempString=in.readLine();
            numberOfYears=Integer.parseInt(tempString);
        }catch(Exception e){}
        float InterestTotal=principalAmount*rateOfInterest*numberOfYears;
        System.out.println("Total Interest is:"+InterestTotal/100);
        }
    }
