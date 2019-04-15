package practice08_190415.ex02;

public class Member implements Comparable<Member> {
	private String name;
	private String email;
	private String tel;

	public Member(String name, String email, String tel) {
		super();
		this.name = name;
		this.email = email;
		this.tel = tel;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", email=" + email + ", tel=" + tel + "]";
	}

	@Override
	public int hashCode() {
		return name.hashCode() + tel.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;
			return member.name.equals(name) && member.tel.equals(tel);
		} else
			return false;
	}
	
	@Override
	public int compareTo(Member m) {
		if(name.compareTo(m.name) > 0)
			return 1;
		else if(name.compareTo(m.name) < 0)
			return -1;
		return tel.compareTo(m.getTel()); //중복이 return 0일때,
	}

}
