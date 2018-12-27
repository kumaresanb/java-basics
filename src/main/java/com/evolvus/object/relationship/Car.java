package com.evolvus.object.relationship;

public class Car {

	//private Engine engine; // Aggregation
	private final Engine engine;// Composition 

	Car(Engine engine) {
		this.engine = engine;
	}
	
	
	public void move() {
		if(engine!=null) {	
		engine.work();
		System.out.println("Car is moving");
		}else {
			System.out.println("Car dosent have engine");
		}
	}
	

}
