import edu.mcw.*;

class BootStrap {

    def init = { servletContext ->
    
    // Test Users Creation
    User admin = new User(
      name: "admin",
	  fname:"Admin",
	  lname: "User",
	  admin: true,
	  active: true,
	  hashed_password: "47c3529dd9134841b18a05450614aff9a37316cc",
	  billable: false
        ).save(failOnError: true)
    
   	User test1 = new User(
      name: "test1",
	  fname:"Test",
	  lname: "User",
	  admin: false,
	  active: true,
	  hashed_password: "47c3529dd9134841b18a05450614aff9a37316cc",
	  billable: true
        ).save(failOnError: true)
    
    Code mcwCode = new Code( name:"MCW", description:	"Medical College of Wisconsin" ).save(failOnError: true);
	Code rgdCode = new Code(name: "RGD", description:	"Rat Genome Database").save(failOnError: true);
	
	Project mcwpVacroj = new Project ( name: "VAC", description: "Vacation", code: mcwCode , active: true).save(failOnError: true) ; 
	Project mcwpHolroj = new Project ( name: "HOL", description: "Holiday", code: mcwCode , active: true).save(failOnError: true) ; 

     
    }
        
    def destroy = {
    }
}
