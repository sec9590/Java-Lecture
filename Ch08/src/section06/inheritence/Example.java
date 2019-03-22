package section06.inheritence;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementationC imp1 = new ImplementationC();
		
		InterfaceA ia = imp1;
		ia.methodA();
		System.out.println();
		
		InterfaceB ib = imp1;
		ib.methodB();
		System.out.println();
		
		InterfaceC ic = imp1;
		ic.methodA();
		ib.methodB();
		ic.methodC();
		System.out.println();
		
	}

}
