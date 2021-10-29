package com.hierarchial_inheritance;

//Hierarchial Inheritance
//parent class: Restaurant
//+useIngredients:any message
//+useVegetables:any message
//subclasses:
//Chinese
//+ servessnoodles:any message
//Mexican:
//+servesnachosandpotatoes:any message
//Italian
//+servesPasta:any message

public class Restaurant {

	public void useIngredients() {
		System.out.println("coffee with milk, which consists of coffee, sugar and milk.");
	}
	public void useVegetables() {
		System.out.println("Cauliflower, Cucumber, Leek");
	}
}
