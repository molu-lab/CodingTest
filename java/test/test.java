import java.sql.*;

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
            PreparedStatement pstmt=conn.prepareStatement("select * from dept");
            ResultSet resultSet=pstmt.executeQuery();
            while(resultSet.next())
            {
                System.out.println(resultSet.getString(1));
            }
            resultSet.close();
            pstmt.close();
            conn.close();
            System.out.println("not error");

        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
