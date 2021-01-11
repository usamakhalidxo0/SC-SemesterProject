import java.sql.Connection;
import java.sql.PreparedStatement;

public class Member {
	private String Enrollement;
	private String Name;
	private String program;
	private String email;
	private String Adress;
	private String DOB;
	private String phoneNumber;
	private String categary;
	int issuedbookCount;
	public Member()
	{
		
	}
	public Member(String Enrollement,String Name, String program, String email,String Adress,String DOB,String PhoneNumber,String categary,int countbook)
	{
		this.Enrollement=Enrollement;
		this.Name=Name;
		this.program=program;
		this.email=email;
		this.Adress=Adress;
		this.DOB=DOB;
		this.phoneNumber=PhoneNumber;
		this.categary=categary;
		this.issuedbookCount=countbook;
	}
	public String getEnrollement() {
		return Enrollement;
	}
	public void setEnrollement(String enrollement) {
		Enrollement = enrollement;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getProgram() {
		return program;
	}
	public void setProgram(String program) {
		this.program = program;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdress() {
		return Adress;
	}
	public void setAdress(String adress) {
		Adress = adress;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getCategary() {
		return categary;
	}
	public void setCategary(String categary) {
		this.categary = categary;
	}
	public String addMember()
	{
		try {
			Connection con =DBMSConnection.establishedConnetion();
			String query = " insert into member (Enrollement, Name, program, Email, Adress,DOB,PhoneNumber,Categary,issuedBooksCount)"
			        + " values (?, ?, ?, ?, ?,?,?,?,?)";
			PreparedStatement preparedStmt =con.prepareStatement(query);
			preparedStmt.setString(1, this.Enrollement);
		      preparedStmt.setString (2, this.Name);
		      preparedStmt.setString(3, this.program);
		      preparedStmt.setString(4, this.email);
		      preparedStmt.setString(5, this.Adress);
		      preparedStmt.setString(6, this.DOB);
		      preparedStmt.setString(7, this.phoneNumber);
		      preparedStmt.setString(8, this.categary);
		      preparedStmt.setInt(9, this.issuedbookCount);
		      preparedStmt.execute();
		      System.out.println("successfuly stored");
		    }
			catch(Exception ex)
			{
				System.out.println(ex.getLocalizedMessage());
			}
			
		
		return null;
	}
	public int getIssuedbookCount() {
		return issuedbookCount;
	}
	public void setIssuedbookCount(int issuedbookCount) {
		this.issuedbookCount = issuedbookCount;
	}
	public String deleteMember()
	{
		try {
			Connection con =DBMSConnection.establishedConnetion();
			String query = "delete from member where Enrollement = ?";
		      PreparedStatement preparedStmt = con.prepareStatement(query);
		      preparedStmt.setString(1,this.Enrollement);
		      preparedStmt.execute();
		      System.out.println("Delete successfully");
			}
			catch(Exception ex)
			{
				System.out.println(ex.getLocalizedMessage());
			}
			
		return null;
	}

}
