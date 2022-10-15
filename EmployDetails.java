package org.sample;

public class EmployDetails {
	// method creation
	
	private void employName () {
        // logic
		System.out.println("Employ name --- Narsingam");


	}
	private void employId() {
		System.out.println("Employ Id = 123");
	
	}
    // normally Execution start from the main met hod
	
	public static void main(String[] args) {
		
		// object creation 
	    // classname objectreferencename = new Classname();
		EmployDetails a = new EmployDetails();
		
		// to call a method
		// objectrefername.methodname();
		
		a.employId();
		a.employName();
		System.out.println("java");
		System.out.println("python");
	    

		

	}
}