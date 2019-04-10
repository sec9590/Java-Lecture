package exercise.ex10;

public class Student implements Comparable {
	public String id;
	public int score;

	public Student(String id, int score) {
		super();
		this.id = id;
		this.score = score;
	}

	@Override
	public int compareTo(Object obj) {
		if (obj instanceof Student) {
			Student student = (Student) obj;
			if (this.score > student.score)
				return 1;
			if (this.score < student.score)
				return -1;
		}
		return 0;
	}
}
