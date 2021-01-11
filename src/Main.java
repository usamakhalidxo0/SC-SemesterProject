

import java.sql.*;
public class Main {

	public static void main(String[] args) {
		
		Book obj=new Book();
		java.util.Date date=new java.util.Date();
		java.sql.Date CurrentsqlDate=new java.sql.Date(date.getTime());
		obj.calculateFine(CurrentsqlDate);
		System.out.print("zahid code main running");
		
		//System.out.println(obj.returnBook("1231231421"));
	}

}
