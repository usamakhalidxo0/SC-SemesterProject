import java.sql.*;
public class DBMSConnection {
	static Connection connection=null;
	
	public static Connection establishedConnetion()
	{
		try {
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3307/scproject", "root", "zahid1234.");
	
		  }
		catch(Exception ex)
		{
			System.out.println(ex.getLocalizedMessage());
		}
		return connection;
	}
	

}
