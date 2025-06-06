

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class jdbc {
    public static void main(String[] args) {
        try{
            String u="jdbc:mysql://localhost:3306/college";
            Connection x= DriverManager.getConnection(u,"root","1234");
            System.out.println("Connected");

            PreparedStatement p=x.prepareStatement("insert into college.java values(?,?)");
            p.setString(2,"Rahul");
            p.setInt(1,102);
            p.executeUpdate();
            System.out.println("Inserted");

            p=x.prepareStatement("select * from college.java");
            ResultSet r=p.executeQuery();
            System.out.println("Try to get Connected");

            while(r.next()) {
                System.out.println("Name:" + r.getString("name"));
                System.out.println("ID:" + r.getString("id"));
            }
        }catch (Exception e){
            System.out.println("not conneccted"+e);
        }
    }
}
