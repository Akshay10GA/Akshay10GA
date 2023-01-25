package com.springorm.ExpenseManagement;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle{
	
	private int price;
	private String name;
	private String isit="yes";
	
	Bike() {
		System.out.println("BikeD Constructor");
	}
	
	Bike(int price,String name){
		this.price=price;
		this.name=name;
	}
	
	public void drive(int price,String name) {
		System.out.println(name+" Bike Running...of Rs."+price+" "+isit);
		
	}
	
	public void eat() {
		System.out.println(name+"Eating at Chaupati.."+price);
		
	}

}
