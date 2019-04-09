package section04_map.ex01_hashmap;

public class Student {
	public int sno;
	public String name;

	public Student(int sno, String name) {
		super();
		this.sno = sno;
		this.name = name;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return sno + name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) { //부모가 자식으로 변화할 때, 내자식이 변했던 것인지 확인해야함.
			Student student = (Student) obj;
			return student.name.equals(name) && (student.sno == sno);
		} else
			return false;
	}

}
