package Test;

import java.util.Scanner;
//There is a fair in city and different prices for adult and child to take a ride. 
//RIDE                             ADULT PRICE                        CHILD PRICE           
//Alibaba                         $50                                          $40
//Alpine slide                  $60                                          $30
//Bumpper Cars              $45                                          $25
//Baloon Race                  $70                                          $60
//
//These are the prices per hour 
//According to number of hours the price is doubled
//Write a class that accepts the number of adults and children 
//who wants to take a ride and display the total money collected 
//for adult ride, children’s ride, and the total amount. Save the class as EnjoyRide.java

public class EnjoyRide {
	
	public static void ride(int adults,int children,int ride,int hrs) {
		switch(ride) {
		case 1:
			int temp1 = 50 * hrs *adults;
			int temp2 = 40 * hrs * children;
			System.out.println("Ride Selected is Alibaba");
			System.out.println("Total Number of Ride "+hrs);
			System.out.println("Total Adults Ride Fair is Rs " +temp1);
			System.out.println("Total Adults Ride Fair is Rs " +temp2);
			System.out.println("Total Fare is "+(temp1+temp2));	
		break;
		
		case 2:
			int temp11 = 60 * hrs *adults;
			int temp22 = 30 * hrs * children;
			System.out.println("Ride Selected is Alpine slide ");
			System.out.println("Total Number of Ride "+hrs);
			System.out.println("Total Adults Ride Fair is Rs " +temp11);
			System.out.println("Total Adults Ride Fair is Rs " +temp22);
			System.out.println("Total Fare is "+(temp11+temp22));
		break;
		
		case 3:
			int temp111 = 45 * hrs *adults;
			int temp222 = 25 * hrs * children;
			System.out.println("Ride Selected is Bumpper Cars ");
			System.out.println("Total Number of Ride "+hrs);
			System.out.println("Total Adults Ride Fair is Rs " +temp111);
			System.out.println("Total Adults Ride Fair is Rs " +temp222);
			System.out.println("Total Fare is"+(temp111+temp222));
		break;
		
		case 4:
			int temp1111 = 70 * hrs *adults;
			int temp2222 = 60 * hrs * children;
			System.out.println("Ride Selected is Baloon Race ");
			System.out.println("Total Number of Ride "+hrs);
			System.out.println("Total Adults Ride Fair is Rs " +temp1111);
			System.out.println("Total Adults Ride Fair is Rs " +temp2222);
			System.out.println("Total Fare is "+(temp1111+temp2222));
		break;
		default:
			System.out.println("Invalid Choice");
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of adults");
		int adults = sc.nextInt();
		System.out.println("Enter the number of children");
		int children = sc.nextInt();
		System.out.println("Enter the choice");
		System.out.println("1.Alibaba"+" "+"2.Alpine slide"+" "+"3.Bumpper Cars"+" "+"4.Baloon Race");
		int ride = sc.nextInt();
		System.out.println("Enter the number of hours that you want to take a ride: ");
		int hrs = sc.nextInt();
		ride( adults, children, ride, hrs);

	}

}
