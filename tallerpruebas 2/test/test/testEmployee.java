package test;

import Employee.Employee;
import Employee.EmployeeType;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class testEmployee {
	Employee empleado1 = new Employee(100,"USD",0,EmployeeType.Worker);
	Employee empleado2 = new Employee(100,"EUR",5,EmployeeType.Manager);
	

	@SuppressWarnings("deprecation")
	@Test
	public void testCs() {
		assertEquals(164.33,empleado1.cs(),0.2f);
		assertEquals(162.83,empleado2.cs(),0.2f);
		
	}
	
	/*
	@SuppressWarnings("deprecation")
	@Test
	public void testCalculateYeatBonus() {
		assertEquals(386,empleado1.CalculateYearBonus(),0.0f);
		assertEquals(481,empleado2.CalculateYearBonus(),0.0f);
		
		
		
	}*/

}
