package exercise.class_ex;

public class StudentScore {
	private String name;
	private int math;
	private int english;
	private int science;
	private double average;

	StudentScore(String name, int math, int english, int science) {
		this.name = name;
		this.math = math;
		this.english = english;
		this.science = science;
	}

	int sum() {
		int sum = this.math + this.english + this.science;
		return sum;
	}

	double average() {
		this.average = (double) sum() / 3;
		return average;
	}

	@Override
	public String toString() {
		return "StudentScore [name=" + name + ", math=" + math + ", english=" + english + ", science=" + science
				+ ", average=" + average + "]";
	}

}
