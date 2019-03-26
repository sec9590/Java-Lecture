package section05.ex01_exit;

public class ExitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setSecurityManager(new SecurityManager(){
			@Override
			public void checkExit(int status) {
				if(status!=5) {
					throw new SecurityException();
				}
			}
		});
		
		for(int i=0; i<=5; i++) {
			System.out.println(i);
			try {
				System.exit(i);
			}catch(SecurityException e) {}
		}
	}

}
