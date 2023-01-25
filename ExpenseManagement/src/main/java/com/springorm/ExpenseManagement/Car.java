package com.springorm.ExpenseManagement;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{
	public void drive() {
		System.out.println("Car Running...");
	}

	public void eat() {
		System.out.println("Eating at MacD..");
		
	}

	public void drive(int price, String name) {
		// TODO Auto-generated method stub
		
	}

}
