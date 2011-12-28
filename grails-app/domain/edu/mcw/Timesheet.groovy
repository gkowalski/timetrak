package edu.mcw

class Timesheet {

	String status
	Date weekof
	User user

	static hasMany = [ timerecord : Timerecord ]

    static constraints = {
    	
    }
    public String toString() {
    	return weekof
    }
    	
    	
}
