package section03.ex06_finalize;

public class FinalizeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter counter = null;
		for(int i = 0; i<=50; i++) {
			counter = new Counter(i);
			
			counter = null;
			
			System.gc();
		}
	}

}
