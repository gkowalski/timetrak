package edu.mcw

class Project {

	Code code
	boolean active
	String name
	String description


    static constraints = {
    }
    
    public String toString() {
    	return description
    }
}
