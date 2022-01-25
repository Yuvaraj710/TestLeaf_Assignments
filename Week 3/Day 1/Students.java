package week3.day1.assignment;

public class Students {
	
	public void getStudentInfo(int id) {
		
		System.out.println("The Student Id is : "+id);
	}
	
	public void getStudentInfo(int id, String name) {
		
		System.out.println("The Student name is "+name+" and Id is "+id);
		
	}
	
	public void getStudentInfo(String email, int phoneNumber) {
		
		System.out.println("Email id "+email+" and phone no "+phoneNumber);
		
	}

	public static void main(String[] args) {
		
		Students info = new Students();
		
		info.getStudentInfo(123676);
		info.getStudentInfo(123676, "Yuvaraj");
		info.getStudentInfo("yuvaraj7@gmail.com", 464585);
		
		
		
	}

}
