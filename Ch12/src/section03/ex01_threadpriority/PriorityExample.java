package section03.ex01_threadpriority;

public class PriorityExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=10; i++) {
			Thread thread = new CalcThread("thread" + i);
			if(i != 10) {
				thread.setPriority(Thread.MIN_PRIORITY);
			} else {
				thread.setPriority(Thread.MAX_PRIORITY);
			}
			thread.start();
		}
	}

}
