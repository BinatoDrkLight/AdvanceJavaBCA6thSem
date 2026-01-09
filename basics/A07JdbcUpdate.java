package basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class A07JdbcUpdate {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/databaseOne";
        String user = "postgres";
        String password = "root";
        String name = "Binato";
        int id = 4;

        try{
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);
            String query = "UPDATE studentone SET name = ? WHERE id = ?;";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, name);
            ps.setInt(2, id);
            int rowsCount = ps.executeUpdate();
            System.out.println(rowsCount);
            System.out.println("Update successfully");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
