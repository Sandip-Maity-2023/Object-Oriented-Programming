package Hotel.src;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

class con {

Connection c;
Statement s;

public con(){
    try{
        c=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/hotel","root","1234");
        s=c.createStatement();
        System.out.println("Database connected successfully");

    }catch (Exception e){
        e.printStackTrace();
    }

}

        public static void main(String[] args) {
            con c = new con();  // This will try to connect and print success or error
        }
    }

