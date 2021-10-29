package com.AssociationProj;

public class UndergradStudent extends Student{
	
	private int year;

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void Bbranch() {
		Branch b = new Branch();
		b.studiesBranch();
	}
	public void Ssociety() {
		Society s = new Society();
		s.collegeSociety();
	}
	
	

}
