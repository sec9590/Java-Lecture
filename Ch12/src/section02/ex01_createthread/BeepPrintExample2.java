package section02.ex01_createthread;

import java.awt.Toolkit;

public class BeepPrintExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		
		//익명구현 객체
		/*
		Thread thread = new Thread(new Runnable()) {
			@Overide
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0; i<5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(500);
					} catch(Exception e) {}
				}
			}
		});
		*/
		
		//람다식 이용
		/*Thread thread = new Thread(() -> {		
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for(int i=0; i<5; i++) {
				toolkit.beep();
				try {
					Thread.sleep(500);
				} catch(Exception e) {}
				}			
		});*/
		
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch(Exception e) {}
		}
	}

}
