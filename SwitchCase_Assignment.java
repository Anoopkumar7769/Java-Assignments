import java.util.*;

public class SwitchCase_Assignment {
	
	public static int res(int n) {
		
		if(n < 1 || n > 6)
			 System.out.println("Invalid Input");
		switch(n) {
		
		case 1: 
			System.out.println("Enter the two Numbers ");
			Scanner sc = new Scanner(System.in);
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			int result = n1 + n2;
			System.out.println("Result is " + result);
		break;
		
		case 2:
			System.out.println("Enter the two Numbers ");
			Scanner s = new Scanner(System.in);
			int num1 = s.nextInt();
			int num2 = s.nextInt();
			int Avg = (num1 + num2)/2;
			System.out.println("Average Score is " + Avg);
		break;
			
		case 3:
			System.out.println("Enter the Number to check Even or Odd: ");
			Scanner s1 = new Scanner(System.in);
			int Num = s1.nextInt();
			if(Num % 2 == 0)
	            System.out.println(Num + " is even");
	        else
	            System.out.println(Num + " is odd");
		break;
		
		case 4:
			System.out.println("Enter the Number to check weather the number is Positive or Not: ");
			Scanner s2 = new Scanner(System.in);
			int Numm = s2.nextInt();
			if(Numm>0)  
			{  
			System.out.println("The number is positive.");  
			}
			else if(Numm<0)  
			{  
			System.out.println("The number is negative.");  
			}
			else  
			{  
			System.out.println("The number is zero.");  
			}  
		break;
			
		case 5:
			System.out.println("Enter the Number to check weather the number is Prime or Not: ");
			Scanner s3 = new Scanner(System.in);
			int x = s3.nextInt();
			boolean flag = false;
		    for (int i = 2; i <= x / 2; ++i) {
		      if (x % i == 0) {   // condition for non-prime number
		        flag = true;
		        break;
		      }
		    }
		    if (!flag)
		      System.out.println(x + " is a prime number.");
		    else
		      System.out.println(x + " is not a prime number.");
		break;
		 
		case 6:
			System.exit(0);
			
		}
		return 0;
	}

	public static void main(String[] args) {
		do {
		System.out.println("Follow the choice and get the access");
		System.out.println("Press 1 for Addition of two numbers");
		System.out.println("Press 2 for Finding Average of two numbers");
		System.out.println("Press 3 to check the number is Even or Odd");
		System.out.println("Press 4 to check Positive or Negative Number");
		System.out.println("Press 5 to Check the number is Prime Number or Not");
		System.out.println("Press 6 to Quit");
		
		
		System.out.println("=====================================");
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		res(n);}while(true);
		
	}
}
