package week3.day1.assignments;

public class Students {
	public void getStudentInfo(int id)
	{
		System.out.println("Student ID is :"+ id);
	
	}
	public void getStudentInfo(int id,String name)   //Same Method Name with different arguments
	{
		 System.out.println("EMPID with Code :"+ name + ""+id);
	}
	public void getStudentInfo(String email,long phonenumber)   //Same Method Name with different arguments
	{
		System.out.println("Email ID is :"+ email);
		System.out.println("Student ContactNo is :" + phonenumber);
	}

	public static void main(String[] args) 
	{
		Students studinfo=new Students();
		System.out.println("********Student Info***********");
		studinfo.getStudentInfo(786);
		studinfo.getStudentInfo(786, "TL");
		studinfo.getStudentInfo("test@testleaf.in", 9876543210l);
	}
}