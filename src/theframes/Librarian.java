package theframes;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Librarian {
  
	private String userName;
	private String password;
	private Connection con;
	public Librarian()
	{
		con =DBMSConnection.establishedConnetion();
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean getLogin(String username,String password)
	{ 
		boolean islogin=false;

		try{
			
			String query = "SELECT userName,password FROM librarian where userName='"+ username+"'";
			Statement st = this.con.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next())
			{
				this.userName=rs.getString("userName");
				this.password=rs.getString("password");
			}
			if(this.password.equals(password))
			{
				islogin=true;
			}
		}
	   catch(Exception ex)
	  {
		System.out.println(ex.getLocalizedMessage());
	  }
		return islogin;
		
	}
	
    
	
}
