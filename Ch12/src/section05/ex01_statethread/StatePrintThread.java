package section05.ex01_statethread;

public class StatePrintThread extends Thread {
	private Thread targetThread;
	
	public StatePrintThread(Thread targetThread) {
		this.targetThread = targetThread;
	}
	
	public void run() {
		while(true) {
			Thread.State state = targetThread.getState();
			System.out.println("타깃스레드상태 : " + state);
			
			if(state == Thread.State.NEW) {
				targetThread.start();
			}
			if(state == Thread.State.TERMINATED) {
				break;
			}
			try {
				//0.5초간 일시정지
				Thread.sleep(500);
			} catch(Exception e) {}
			
		}
	}

}
