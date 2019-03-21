package section03.super_contructor;

public class Student extends People{
	public int studentNo;

	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);
		this.studentNo = studentNo;
	}

	@Override
	public String toString() {
		return "Student [studentNo=" + studentNo + ", name=" + name + ", ssn=" + ssn + "]";
	}

	
}
