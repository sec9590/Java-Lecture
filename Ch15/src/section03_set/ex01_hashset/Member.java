package section03_set.ex01_hashset;

public class Member {

	public String name;
	public int age;
	public String tel;

	public Member(String name, int age, String tel) {
		super();
		this.name = name;
		this.age = age;
		this.tel = tel;
	}

	@Override
	public int hashCode() { //name과 age값이 같으면 true 리턴
		// TODO Auto-generated method stub
		return name.hashCode() + tel.hashCode();
		// return Objects.hash(name, age)
	}

	@Override
	public boolean equals(Object obj) { //name과 age같으면 true
		if (obj instanceof Member) { //부모가 자식으로 변화할 때, 내자식이 변했던 것인지 확인해야함.
			Member member = (Member) obj;
			return member.name.equals(name) && (member.tel == tel);
		} else
			return false;
	}

}
