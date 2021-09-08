import java.io.DataInputStream;
import java.sql.*;
import java.util.Base64;
import java.util.Base64.*;
import java.lang.*;
import java.util.Base64.Decoder;

import static java.sql.DriverManager.getConnection;

public class DBCodeSnippet {
    final String user = "hsp-rt-001";
    final String passEncrypted = "Zkxzd21xdTg=";
    byte[] decoded =Base64.getMimeDecoder().decode(passEncrypted);
    String pass = new String(decoded);
    private String db_URL = "jdbc.sqlserver://10.134.166.107:1433;databaseName=hsp-crd-db84;user="+user+";password="+pass;

    static void db_setup(String db_URL, String user, String pass) {
        try {
            Connection con = DriverManager.getConnection(db_URL,user,pass);
            PreparedStatement preparedStatement = con.prepareStatement("Select * from table_nm where id =?");
            DataInputStream dis = new DataInputStream(System.in);

        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }


}
