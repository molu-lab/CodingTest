import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
enum sqlClass{
    sqlite{
        @Override
        public String toString(){
            return "org.sqlite.JDBC";
        }
    };

}

public class test {


    public static void main(String[] args)
    {
        Connection conn;
        try {
            Class.forName(sqlClass.sqlite.toString());

            conn= DriverManager.getConnection("jdbc:sqlite:java/database/mysqlite.db");
            System.out.println("not error");

        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
