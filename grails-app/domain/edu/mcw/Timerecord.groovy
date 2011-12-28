package edu.mcw

class Timerecord {
	
	Date daterecorded
	Code code 
	Project project 
	Float hours
	String comment

	static belongsTo = [ timesheet: Timesheet ] 
	
    static constraints = {
    }
    
    public String toString() {
    	return daterecorded
    }	
}
