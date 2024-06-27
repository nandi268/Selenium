package AbstractClass;

public class Dell extends Laptop 	 {
	void start() {
		System.out.println("start the dell laptop");
	}
	public void print() {
		System.out.println("print the parants from laptop");
	}
	public static void main(String args[]) {
		Dell d= new Dell();
		d.start();
		d.print();
		d.enter();
		d.type();
	}

}
