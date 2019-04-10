package exercise.ex08;

public class Student {
	public int StudentNum;
	public String name;

	public Student(int StudentNum, String name) {		
		this.StudentNum = StudentNum;
		this.name = name;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return StudentNum;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) { //부모가 자식으로 변화할 때, 내자식이 변했던 것인지 확인해야함.
			Student student = (Student) obj;
			return student.StudentNum == StudentNum;
		} else
			return false;
	}

}
