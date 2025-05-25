import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestDB {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/magazin_db";
        String user = "root";
        String password = "Admin";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conexiune reușită la baza de date!");

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM categorie");

            while (rs.next()) {
                System.out.println("Categorie: " + rs.getString("nume"));
            }

            conn.close();
        } catch (Exception e) {
            System.out.println("Eroare la conectare: " + e.getMessage());
        }
    }
}
