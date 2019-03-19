package exercise.class_ex;

public class StudentScore {
	String name;
	int math;
	int english;
	int science;
	double average;

	StudentScore(String name, int math, int english, int science) {
		this.name = name;
		this.math = math;
		this.english = english;
		this.science = science;
	}

	@Override
	public String toString() {
		return "StudentScore [name=" + name + ", math=" + math + ", english=" + english + ", science=" + science
				+ ", average=" + average + "]";
	}

	double average() {
		average = (double) (math + english + science)/3;
		return average;
	}

}
