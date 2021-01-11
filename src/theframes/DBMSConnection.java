package theframes;

import java.sql.Connection;
import java.sql.DriverManager;
public class DBMSConnection {
	static Connection connection=null;
	
	public static Connection establishedConnetion()
	{
		try {
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3307/scproject", "root", "zahid1234.");
	        Main obj=new Main();
		  }
		catch(Exception ex)
		{
			System.out.println(ex.getLocalizedMessage());
		}
		return connection;
	}
	

}
