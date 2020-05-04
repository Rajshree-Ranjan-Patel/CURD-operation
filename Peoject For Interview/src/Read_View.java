import java.sql.*;
public class Read_View {
  public static void main(String[] args) throws Exception
    {
        Class.forName("com.mysql.jdbc.Driver").newInstance();
         Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Lenevo\\Documents\\Peoject For Interview\\acp.sqlite");
         
         Statement st = conn.createStatement();
         String sql = "SELECT id, name , dob FROM employee";
         
         
         ResultSet rs = st.executeQuery(sql);
         while(rs.next()) {
         System.out.println(rs.getInt("id"));
         System.out.println(rs.getString("name"));
         System.out.println(rs.getInt("dob"));
         System.out.println("**********************************");
         
        
         }
         st.close();
         conn.close();
         
         System.out.println("SQL Selected successfully");
    }
}
