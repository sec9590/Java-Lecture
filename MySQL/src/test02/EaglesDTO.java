package test02;

public class EaglesDTO {
	private int backNo;
	private String name;
	private String position;
	private String highschool;
	private String throw_hand;
	private String hit_hand;
	private String birth;
	private int salary;

	public EaglesDTO() {}
	
	public EaglesDTO(int backNo, String name, String position, String highschool, String throw_hand, String hit_hand,
			String birth, int salary) {
		super();
		this.backNo = backNo;
		this.name = name;
		this.position = position;
		this.highschool = highschool;
		this.throw_hand = throw_hand;
		this.hit_hand = hit_hand;
		this.birth = birth;
		this.salary = salary;
	}

	public int getBackNo() {
		return backNo;
	}

	public void setBackNo(int backNo) {
		this.backNo = backNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getHighschool() {
		return highschool;
	}

	public void setHighschool(String highschool) {
		this.highschool = highschool;
	}

	public String getThrow_hand() {
		return throw_hand;
	}

	public void setThrow_hand(String throw_hand) {
		this.throw_hand = throw_hand;
	}

	public String getHit_hand() {
		return hit_hand;
	}

	public void setHit_hand(String hit_hand) {
		this.hit_hand = hit_hand;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EaglesDTO [backNo=" + backNo + ", name=" + name + ", position=" + position + ", highschool="
				+ highschool + ", throw_hand=" + throw_hand + ", hit_hand=" + hit_hand + ", birth=" + birth
				+ ", salary=" + salary + "]";
	}
	
}
