package week3.day1.assignment;

public class Student extends Department {
	
	public void studentName(String Name) {
		System.out.println("The Student name is : "+ Name);
		
	}
	
	public void studentDept(String Dept) {
		System.out.println("The Depart Name  : "+Dept);
	}
	
	public void studentId(int id) {
		System.out.println("Id No of Student :"+id);
	}

	public static void main(String[] args) {
		
		Student studentInfo = new Student();
		
		studentInfo.collegeName();
		studentInfo.collegeCode();
		studentInfo.collegeRank();
		studentInfo.deptName();
		studentInfo.studentName("Yuvaraj");
		studentInfo.studentDept("IT");
		studentInfo.studentId(361057);	
	}

}
