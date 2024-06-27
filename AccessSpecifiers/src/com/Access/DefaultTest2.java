package com.Access;
 class DefaultTest2 implements DefaultTest3{
	 public static void main(String args[]) {
	 DefaultTest1 b=new DefaultTest1();
	 b.m1();
	 DefaultTest3 c=new DefaultTest2();
	 c.m3();
	 c.m4();
	 
	

}
	 public void m3() {
		 System.out.println("interface method implemented");
	 }
 }

	 