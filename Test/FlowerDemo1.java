package Test;
import java.util.*;

public class FlowerDemo1 {
	
	public static void displayFlower(String continent)
	{
		if(continent.equalsIgnoreCase("Asia"))
		{
			TreeMap<String,String> obj1=new TreeMap<>();
			obj1.put("INDIA ", " LOTUS");
			obj1.put("PAKISTAN ", " JASMINE");
			obj1.put("NEPAL ", " LALI GURANS ");
			System.out.println("COUNTRY NAMES"+" AND NATIONAL FLOWERS");
			Set s1=obj1.entrySet();
			s1.forEach(System.out::println);
		}
		else if(continent.equalsIgnoreCase("Europe"))
		{
			TreeMap<String,String> obj2=new TreeMap<>();
			obj2.put("GERMANY ", " CORN FLOWER ");
			obj2.put("FRANCE ", " LILY");
			obj2.put("GREECE ", " ACANTHUS MOLLIS ");
			System.out.println("COUNTRY NAMES"+" AND NATIONAL FLOWERS");
			Set s2=obj2.entrySet();
			s2.forEach(System.out::println);
			}
		else if(continent.equalsIgnoreCase("Africa"))
		{
			TreeMap<String,String> obj3 =new TreeMap<>();
			obj3.put("EGYPT ", " BLUE LOTUS");
			obj3.put("NIGERIA ", " YELLOW TRUMPET ");
			obj3.put("KENYA ", " ORCHID");
			System.out.println("COUNTRY NAMES"+" AND NATIONAL FLOWERS");
			Set s3=obj3.entrySet();
			s3.forEach(System.out::println);
			}
		
		else
			System.out.println("Invalid Option");
	}
		
		
		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the name of continent");
			String temp = sc.next();
			displayFlower(temp);
		}

	
}
