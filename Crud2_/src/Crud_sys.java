import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Crud_sys {

	public static void main(String[] args) throws SQLException {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Crud_","root","W7301@jqir#");
			System.out.println("Connection Successfully..");
//			String sql = "INSERT INTO crud_pro (name ,age) VALUES (?,?)";
//			PreparedStatement statement = con.prepareStatement(sql);
//			statement.setString(1, "sanj");
//			statement.setInt(2, 22);
//			statement.executeUpdate();
//			System.out.println("Record created.");
			
			
//			String sql = "SELECT id,name,age FROM crud_pro WHERE id = ?";
//			PreparedStatement statement = con.prepareStatement(sql);
//			statement.setInt(1,1);
//			ResultSet result = statement.executeQuery();
//			if(result.next()) {
//				System.out.println("name : "+result.getString("name"));
//				System.out.println("age : "+result.getInt("age"));
////				System.out.println(result.getString("name"));
//			}
			
			
			
//			String sql = "UPDATE crud_pro SET name =?,age = ? WHERE id = ?";
//			PreparedStatement statement = con.prepareStatement(sql);
//			statement.setString(1, "john");
////			statement.setString(2, " ");
//			statement.setInt(2, 22);
//			statement.setInt(3, 1);
//			statement.executeUpdate();
//			System.out.println("Record updated");
			
			
			
			String sql = "DELETE FROM crud_pro WHERE id =?";
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setInt(1, 1);
			statement.executeUpdate();
			System.out.println("Record deleted");
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}

}
