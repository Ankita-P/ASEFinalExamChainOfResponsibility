/*
 * Created by Ankita Patil
 * This class is a concrete implementation for the Employee Handler
 */
package com.ase.exam.designpattern;

public class Painter extends Employee {

	public Painter() {
		this.authorityLevel = PAINTER;
	}
	
	@Override
	protected void write(String message) {
		message = message.concat("car complete");
		System.out.println(message);
	}

}
