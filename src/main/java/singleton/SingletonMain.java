package singleton;

public class SingletonMain {

    public static void main(String[]arg){


        MySQLClient mySQLClient = MySQLClient.getClient();
        System.out.println(mySQLClient.getData());

        MySQLClient mySQLClient2 = MySQLClient.getClient();
        System.out.println(mySQLClient2.getData());

        MySQLClient mySQLClient3 = MySQLClient.getClient();
        System.out.println(mySQLClient3.getData());





    }
}
