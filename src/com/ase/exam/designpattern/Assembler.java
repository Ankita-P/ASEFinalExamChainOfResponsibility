/*
 * Created by Ankita Patil
 * This class is a concrete implementation for the Employee Handler
 */
package com.ase.exam.designpattern;

public class Assembler extends Employee {

	public Assembler() {
		this.authorityLevel = ASSEMBLER;
	}
	
	@Override
	protected void write(String message) {
		message = message.concat("all parts have been put together");
		System.out.println(message);
	}
}
