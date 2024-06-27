package com.Abstraction;



public class car {
	
		private Engine e=new Engine();
		private Wheel w=new Wheel();
		public void move() {
			e.GenerateEnergy();
			w.rotate();
			
			System.out.println("move to the car");
		}
		
	}


