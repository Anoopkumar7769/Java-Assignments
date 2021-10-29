package com.AssociationProj;

public class MainClass {

	public static void main(String[] args) {
		
		UndergradStudent u = new UndergradStudent();
		u.setCity("Bangalore");
		u.setName("Anoop");
		u.setRollno(101);
		u.setYear(2018);
		System.out.println(u.getCity());
		System.out.println(u.getName());
		System.out.println(u.getRollno());
		System.out.println(u.getYear());
		u.Bbranch();
		u.Ssociety();
		
		System.out.println("==========================");
		
		UndergradStudent us = new UndergradStudent();
		us.setCity("Bidar");
		us.setName("Ajith");
		us.setRollno(102);
		us.setYear(2018);
		System.out.println(us.getCity());
		System.out.println(us.getName());
		System.out.println(us.getRollno());
		System.out.println(us.getYear());
		us.Bbranch();
		
		
	}

}
