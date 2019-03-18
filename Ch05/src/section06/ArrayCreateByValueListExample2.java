package section06;

public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores;
		scores = new int[] { 83, 90, 87 };
		int sum1 = 0;
		for (int score : scores) {
			sum1 += score;
		}
		System.out.println("총 합 : " + sum1);

		int sum2 = add(scores);
		System.out.println("총 합 : " + sum2);
		add1(scores);
		System.out.println();
	}

	public static int add(int[] scores) {
		int sum = 0;
		for (int score : scores) {
			sum += score;
		}
		return sum;
	}
	
	public static void add1(int[] scores) {
		int sum = 0;
		for (int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총 합 : " + sum);
	}
	
	public static int add2(int[] scores) {
		int sum = 0;
		for (int i=0; i<3; i++) {
			sum += scores[i];
		}
		return sum;
	}

}
