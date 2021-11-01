package Test;

import java.util.Scanner;

//CREATE A CLASS EMPLOYEE WITH THE FOLLOWING INSTANCE VARIABLES.
//EMPLOYEEID, EMPLOYEEname, BASICSALARY, SPECIALALLOWANCE(SA), HRA, TRANSPORTALLOWANCE,
//TAX DEFAULT VALUE IS RS. 2500.
//ADD A METHOD CALCULATENETSALARY WHICH IS USED FOR CALCULATING NET SALARY OF EMPLOYEE 
//AND DISPLAYS IT AS WELL.
//USE THE FOLLOWING FORMULA FOR CALCULATING NET SALARY.
//NETSALARY= BASICSALARY+HRA+SPECIALAALLOWANCE+TRANSPORTALLOWANCE-TAX.
//Basic Salary <= 10000 : HRA = 20%, SA = 80%
//Basic Salary is between 10001 to 20000 : HRA = 25%, SA = 90%
//Basic Salary >= 20001 : HRA = 30%, SA = 95%
//CALCULATE NET SALARY OF AN EMPOYEE WITH THE FOLLOWING CONDITIONS
//A.	FOR SOFTWARE_ENGINEER THE TRANSPORTALLOWANCE IS 20% OF BASIC SALARY 

public class Employee {
	
	public static void CalculateNetSalary(int EmployeeId,String EmployeeName,double BasicSalary,double HRA,double SpecialAllowance,double TransportAllowance) {
		double NetSalary;
		double Tax=2500.0;
		
		if(BasicSalary <= 10000) {
			HRA = (BasicSalary)*.20;
			SpecialAllowance=SpecialAllowance*.80;
			TransportAllowance=(BasicSalary)*.20;
			NetSalary=BasicSalary+HRA+SpecialAllowance+TransportAllowance-Tax;
			System.out.println("Net Salary is: "+NetSalary);
		}
		else if(BasicSalary > 10000 && BasicSalary<=20000) {
			HRA = (BasicSalary)*.25;
			SpecialAllowance=SpecialAllowance*.90;
			TransportAllowance=(BasicSalary)*.20;
			NetSalary=BasicSalary+HRA+SpecialAllowance+TransportAllowance-Tax;
			System.out.println("Net Salary is: "+NetSalary);
		}
		else {
			HRA = (BasicSalary)*.30;
			SpecialAllowance=SpecialAllowance*.95;
			TransportAllowance=(BasicSalary)*.20;
			NetSalary=BasicSalary+HRA+SpecialAllowance+TransportAllowance-Tax;
			System.out.println("Net Salary is: "+NetSalary);
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the EmployeeId");
		int EmployeeId = sc.nextInt();
		System.out.println("Enter the EmployeeName");
		String EmployeeName = sc.next();
		System.out.println("Enter the BasicSalary");
		double BasicSalary = sc.nextDouble();
		System.out.println("Enter the SpecialAllowance");
		double SpecialAllowance = sc.nextDouble();
		System.out.println("Enter the HRA");
		double HRA = sc.nextDouble();
		System.out.println("Enter the TransportAllowance");
		double TransportAllowance = sc.nextDouble();
		CalculateNetSalary(EmployeeId,EmployeeName,BasicSalary,SpecialAllowance,HRA,TransportAllowance);
	}

}
