package basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class A06JdbcSelect {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/databaseOne";
        String user = "postgres";
        String password = "root";

        try{
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);
            String query = "Select * from studentone;";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet resultSet = ps.executeQuery();
            while(resultSet.next()){
                System.out.print(resultSet.getInt(1));
                System.out.print(" ");
                System.out.print(resultSet.getString(2));
                System.out.print(" ");
                System.out.print(resultSet.getString(3));
                System.out.print(" ");
                System.out.print(resultSet.getString(4));
                System.out.print(" ");
                System.out.print(resultSet.getString(5));
                System.out.print(" ");
                System.out.print(resultSet.getString(6));
                System.out.print(" ");
                System.out.println(resultSet.getString(7));
            }
            conn.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
