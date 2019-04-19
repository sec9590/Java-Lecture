package test_190328.exam14;

import java.util.Objects;

public class Student extends Person{
	private int id;
	private String name;
	private int score;
	
	public Student(int id, String name, int score) {
		super();
		this.id = id;
		this.name = name;
		this.score = score;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}	
	
	

}
