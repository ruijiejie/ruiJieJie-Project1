import com.java.BaseInfo;
import com.java.GetBaseInfo;
import java.sql.*;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws ClassNotFoundException {
        BaseInfo bs=new GetBaseInfo();
        Connection con;
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/TestDB";
        String user="root";
        String pwd="123456";
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url,user,pwd);
            Statement statement=con.createStatement();
            String sql ="select user_name from user_tbl where user_no=\"1\"";
            if(!con.isClosed())
                System.out.println("连接成功");
            ResultSet rs=statement.executeQuery(sql);
            String name=null;
            while (rs.next())
            {
                name=rs.getString("user_name");
                System.out.println(bs.getName(name));
            }
            rs.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }catch (ClassNotFoundException e)
        {
            System.out.println("无法找到驱动");
            e.printStackTrace();
        }
        finally {
            System.out.println("select success!");
        }

    }
}
