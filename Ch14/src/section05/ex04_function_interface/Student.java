package section05.ex04_function_interface;

public class Student {

	private String name;
	private int mathscore;
	private int englishscore;

	public Student(String name, int mathscore, int englishscore) {
		super();
		this.name = name;
		this.mathscore = mathscore;
		this.englishscore = englishscore;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMathScore() {
		return mathscore;
	}

	public void setMathScore(int mathscore) {
		this.mathscore = mathscore;
	}

	public int getEnglishScore() {
		return englishscore;
	}

	public void setEnglishScore(int englishscore) {
		this.englishscore = englishscore;
	}

	
}
