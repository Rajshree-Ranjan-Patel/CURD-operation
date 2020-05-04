import java.sql.*;
public class Delete_View {
    public static void main(String[] args) throws Exception
    {
        Class.forName("com.mysql.jdbc.Driver").newInstance();
         Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Lenevo\\Documents\\Peoject For Interview\\acp.sqlite");
         
         Statement st = conn.createStatement();
         String sql = "DELETE FROM employee  WHERE id =1902";
         st.executeUpdate(sql);
         
         st.close();
         conn.close();
         
         System.out.println("SQL Deleted successfully");
    }
}
