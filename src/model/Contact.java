package model;

import java.util.Comparator;

import processing.core.PApplet;

public class Contact extends Person implements Comparable<Contact> {

	private String age;
	private PApplet app;

	public Contact(String name, String lastName, String mail, String age, String nationality, String cellNumber, PApplet app) {
		super(name, lastName, mail, nationality, cellNumber, app);
		this.app=app;
		this.age=age;
	}
	
	public void drawData(int x, int y, PApplet app) {

		//System.out.println(name+lastName+mail+age+nationality+cellNumber);
		
		app.text(name, x, y);
		app.text(lastName, x+ 20*4, y );
		app.text(mail, x+ 45*4, y );
		app.text(age, x+ 62*6, y );
		app.text(nationality, x+ 105*4, y );
		app.text(cellNumber, x + 135*4, y);

	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public int compareTo(Contact o1) {
		
		return Comparators.NAME.compare(this, o1);
		
	}
	
	  public static class Comparators {

	        public static Comparator<Contact> NAME = new Comparator<Contact>() {
	            @Override
	            public int compare(Contact o1, Contact o2) {
	                return o1.name.compareTo(o2.name);
	            }
	        };
	        
	        public static Comparator<Contact> LASTNAME = new Comparator<Contact>() {
	            @Override
	            public int compare(Contact o1, Contact o2) {
	                return o1.lastName.compareTo(o2.lastName);
	            }
	        };
	        
	        public static Comparator<Contact> MAIL = new Comparator<Contact>() {
	            @Override
	            public int compare(Contact o1, Contact o2) {
	                return o1.mail.compareTo(o2.mail);
	            }
	        };
	        
	        public static Comparator<Contact> AGE = new Comparator<Contact>() {
	            @Override
	            public int compare(Contact o1, Contact o2) {
	     
	            	int age1=0, age2=0;
	            	try {
	            		age1 = Integer.parseInt(o1.age);
	            		age2 = Integer.parseInt(o2.age);
	            	}
	            	catch(Exception e) {
	            		
	            	}
	                return age1 - age2;
	            }
	        };
	        
	        public static Comparator<Contact> NATIONALITY = new Comparator<Contact>() {
	            @Override
	            public int compare(Contact o1, Contact o2) {
	                return o1.nationality.compareTo(o2.nationality);
	            }
	        };
	  
	  
	   public static Comparator<Contact> CELLNUMBER = new Comparator<Contact>() {
           @Override
           public int compare(Contact o1, Contact o2) {
    
           	int cellNumber1=0, cellNumber2=0;
           	try {
           		cellNumber1 = Integer.parseInt(o1.cellNumber);
           		cellNumber2 = Integer.parseInt(o2.cellNumber);
           	}
           	catch(Exception e) {
           		
           	}
               return cellNumber1 - cellNumber2;
           }
       };
}
}

