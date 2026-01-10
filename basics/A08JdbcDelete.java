package basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class A08JdbcDelete {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/databaseOne";
        String user = "postgres";
        String password = "root";
        int id = 2;

        try{
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);
            String query = "DELETE FROM studentone WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, id);

            int rowsCount = ps.executeUpdate();
            System.out.println(rowsCount);
            System.out.println("Delete successful");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
