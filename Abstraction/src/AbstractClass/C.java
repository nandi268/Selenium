package AbstractClass;

public class C extends B {
	void m3() {
		System.out.println("shantha");
	}
	void m1() {
		System.out.println("hooooo");
	}
	public static void main(String args[]) {
		C ref=new C();
		ref.m1();
		ref.m2();
		ref.m3();
		ref.m4();
	}
	

}
