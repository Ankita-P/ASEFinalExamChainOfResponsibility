/*
 * Created by Ankita Patil
 * This class acts as an Interface for the concrete handlers.
 * Primary function of the class is to receive requests and process it, pass request to next handler
 */
package com.ase.exam.designpattern;

public abstract class Employee {
	public static int PART_COLLECTOR = 4;
	public static int ASSEMBLER = 3;
	public static int WELDER = 2;
	public static int PAINTER = 1;
	
	protected int authorityLevel;
	
	protected Employee nextEmployee;
	
	public void setNextEmployee(Employee employee)
	{
		this.nextEmployee = employee;
	}
	
	public void doWork(int authorityLevel, String message)
	{
		if(this.authorityLevel <= authorityLevel)
		{
			write(message);
		}
		
		if(nextEmployee != null)
		{
			nextEmployee.doWork(authorityLevel, message);
		}
	}
	
	abstract protected void write(String message);
}
