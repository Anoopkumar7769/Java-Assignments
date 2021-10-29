package com.hierarchial_inheritance;

public class mainMethod {

	public static void main(String[] args) {
		Chinese c = new Chinese();
		c.servessnoodles();
		c.useIngredients();
		c.useVegetables();
		
		Mexican m = new Mexican();
		m.servesnachosandpotatoes();
		m.useIngredients();
		m.useVegetables();
		
		Italian i = new Italian();
		i.servesPasta();
		i.useIngredients();
		i.useVegetables();
		

	}

}
