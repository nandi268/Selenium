package com.Access;

public interface interface1 {
	abstract void m1();
	default void m2() {
		System.out.println("i am default method of outside of interface");
	
		
	}

}
