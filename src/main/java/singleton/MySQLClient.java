package singleton;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySQLClient {
    public static MySQLClient client = null;
    public static Connection con;
    public static Statement statement;
    public static ResultSet resultSet;

    // private constructor
    private MySQLClient() {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://us-east.connect.psdb.cloud/testdb?sslMode=VERIFY_IDENTITY",
                    "ekz9yggnjvy0dm9jghmh",
                    "pscale_pw_u9YWeqMNm6UIkRFPcavln3gZb134NVOdwhvhxnKptj4");
        }

        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public static MySQLClient getClient() {
        if (client == null) {
            System.out.println("successful connection");
            client = new MySQLClient();
        }
        return client;
    }


    public String getData() {

        return null;
    }
}
