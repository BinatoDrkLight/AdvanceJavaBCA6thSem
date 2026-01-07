package basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class A05JdbcInsert {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/databaseOne";
        String user = "postgres";
        String password = "root";

        try{
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);
            String query = "INSERT INTO studentone(id, name, email, gender, department, course, address) VALUES ('5', 'ram', 'ram@gmail.com', 'male', 'science', 'BIT', 'KTM')";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.execute();
            System.out.println("Connected to PostgreSQL successfully");
            conn.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
