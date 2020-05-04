import java.sql.*;
public class Update_View {
    public static void main(String[] args) throws Exception
    {
        Class.forName("com.mysql.jdbc.Driver").newInstance();
         Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Lenevo\\Documents\\Peoject For Interview\\acp.sqlite");
         
         Statement st = conn.createStatement();
         String sql = "UPDATE employee SET name = 'Rajshree Patel' WHERE id =1901";
         st.executeUpdate(sql);
         
         st.close();
         conn.close();
         
         System.out.println("SQL updated successfully");
    }
}
