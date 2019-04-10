package practice06_190410.ex03;

import java.time.LocalDate;

enum Position {
	부장, 차장, 과장, 대리, 사원
}

public class Company implements Comparable<Company> {

	public int num;
	public String name;
	public Position position;
	public LocalDate hiredate;

	public Company(int num, String name, Position position, LocalDate hiredate) {
		super();
		this.num = num;
		this.name = name;
		this.position = position;
		this.hiredate = hiredate;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public LocalDate getHiredate() {
		return hiredate;
	}

	public void setHiredate(LocalDate hiredate) {
		this.hiredate = hiredate;
	}

	@Override
	public String toString() {
		return "Company [num=" + num + ", name=" + name + ", position=" + position + ", hiredate=" + hiredate + "]";
	}

	@Override
	public int compareTo(Company c) {
		if (position.ordinal() < c.position.ordinal())
			return -1;
		else if (position.ordinal() > c.position.ordinal())
			return 1;
		else {
			return hiredate.compareTo(c.hiredate);
		}
	}

}
