package section07.ex02_korean;

public class Korean {
	//필드
	String nation = "대한민국";
	String name;
	String ssn;
	
	//생성자
	/*public Korean(String n, String s) {
		name = n;
		ssn = s;
	}*/
	
	public Korean(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
}
