package Test;
//ADD A METHOD displayFlower WHICH DISPLAYS COUNTRIES NAME AND NATIONAL FLOWERS. 
//CONTINENT NAME IS PASSED AS AN ARGUMENT.
//YOU MAY USE THE FOLLOWING SAMPLE DATA AS INPUT
public class FlowerDemo {
	
	public static void displayFlower(String display) {
		
		if(display == "Asia") {
			 System.out.println("Continent Name: Asia");
			 System.out.println("Country Name: India and National Flower : LOTUS");
			 System.out.println("Country Name: Pakistan and National Flower : JASMINE");
			 System.out.println("Country Name: Nepal and National Flower : LALI GURANS");
			}
		else if(display == "Europe") {
			 System.out.println("Continent Name: Europe");
			 System.out.println("Country Name: GERMANY and National Flower : CORN FLOWER");
			 System.out.println("Country Name: FRANCE and National Flower : LILY");
			 System.out.println("Country Name: GREECE and National Flower : ACANTHUS MOLLIS");
		}
		else if(display == "Africa")
		{
			 System.out.println("Continent Name: Africa");
			 System.out.println("Country Name : EGYPT and National Flower : BLUE LOTUS");
			 System.out.println("Country Name : NIGERIA and National Flower : YELLOW TRUMPET ");
			 System.out.println("Country Name : KENYA and National Flower : ORCHID");
		}
		else {
			System.out.println("Invalid Option");
		}
	}
	
	public static void main(String[] args) {
		displayFlower("Asia");
	}
}
