package section05;

public class ConditionalOperationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 55;
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : (score > 70 ? 'C' : (score > 60 ? 'D' : 'F')));
		System.out.println(score + "점은 " + grade + "등급입니다.");
	}

}
