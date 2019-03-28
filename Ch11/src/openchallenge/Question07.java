package openchallenge;

public class Question07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int c = 1; c < 1000; c++) {
			for (int b = 1; b < c; b++) {
				for (int a = 1; a < b; a++) {
					if (c < (a + b)) {
						if (Math.pow(c, 2) == (Math.pow(a, 2) + Math.pow(b, 2))) {
							if (a + b + c == 1000) {
								System.out.println("a + b + c = 1000이 되는 피타고라스 수 > " + a + ", " + b + ", " + c);
							}
						}
					}
				}
			}
		}
	}

}
