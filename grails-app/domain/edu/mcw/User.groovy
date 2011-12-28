package edu.mcw

class User {

	String name
	String fname
	String lname
	boolean admin
	boolean active
	String hashed_password
	boolean billable

    static constraints = {
    }
    
    public String toString() { 
    	
    	return name
    }
}
