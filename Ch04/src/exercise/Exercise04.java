package exercise;

public class Exercise04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean run = true;

		while (run) {
			int a = (int) (Math.random() * 6) + 1;
			int b = (int) (Math.random() * 6) + 1;
			System.out.println("(" + a + "," + b + ")");

			if ((a + b) == 5) {
				System.out.println("> 합이 5가 됩니다.");
				run = false;
			}
		}

	}

}
