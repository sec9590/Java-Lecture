package practice05_190408.ex02;

public class Member implements Comparable<Member> {

	private String name;
	private String id;
	private String password;
	private int age;

	public Member(String name, String id, String password, int age) {
		super();
		this.name = name;
		this.id = id;
		this.password = password;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Member m) {
		String age1 = String.valueOf(this.getAge());
		String age2 = String.valueOf(m.getAge());
		int result = age1.compareTo(age2);

		return result;
	}
}