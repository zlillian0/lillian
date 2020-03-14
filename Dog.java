package yyy;

import java.io.Serializable;

public class Dog extends Animal {
	private String name;
	private String no;
	public Dog(String name) {
		super (name);
		this.name=name;
	}
	
	public void speak() {
		System.out.println("This is Dog " + name + " speaking.");
	}
}
