/*
 * Created by Ankita Patil
 * This class is a concrete implementation for the Employee Handler
 */
package com.ase.exam.designpattern;

public class Welder extends Employee {
	
	public Welder() {
		this.authorityLevel = WELDER;
	}
	@Override
	protected void write(String message) {
		message = message.concat("all parts have been welded together");
		System.out.println(message);
	}


}
