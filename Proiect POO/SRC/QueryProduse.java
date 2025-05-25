import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class QueryProduse {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/magazin_db";
        String user = "root";
        String password = "Admin";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conexiune reușită!");

            String sql = "SELECT p.nume AS produs, c.nume AS categorie, d.nume AS distribuitor, p.cantitate_stoc " +
                         "FROM produs p " +
                         "JOIN categorie c ON p.categorie_id = c.id " +
                         "JOIN distribuitor d ON p.distribuitor_id = d.id";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("\n--- Lista produse ---");
            while (rs.next()) {
                System.out.println("Produs: " + rs.getString("produs") +
                                   ", Categorie: " + rs.getString("categorie") +
                                   ", Distribuitor: " + rs.getString("distribuitor") +
                                   ", Stoc: " + rs.getInt("cantitate_stoc"));
            }

            conn.close();
        } catch (Exception e) {
            System.out.println("Eroare: " + e.getMessage());
        }
    }
}
