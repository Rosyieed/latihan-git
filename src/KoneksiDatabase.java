import java.sql.*;
import javax.swing.JOptionPane;

public class KoneksiDatabase {
    private static java.sql.Connection conn;
    
    public static java.sql.Connection getKoneksi(){
        if (conn == null){
            try {
                String url = "jdbc:mysql://sql12.freemysqlhosting.net:3306/sql12612200";
                String user = "sql12612200";
                String password = "wg2niWP3tC";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                conn = DriverManager.getConnection(url, user, password);
                System.out.println("Koneksi Berhasil");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Koneksi Bermasalah");
            }
        }
        return conn;
    }
    
    public static void main(String[] args) {
        getKoneksi();
    }
}
