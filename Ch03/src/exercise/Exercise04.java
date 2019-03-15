package exercise;

public class Exercise04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pencils = 534;
		int students = 30;
		
		int pencilsPerStudent = (pencils/students);
		System.out.println("학생 한명 당 연필 수 : " + pencilsPerStudent);
		
		//남은 연필수
		int pencilsLeft = (pencils%students);
		System.out.println("남은 연필 수 : " + pencilsLeft);
	}

}
