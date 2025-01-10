package contactify;


//Contact class model
public class Contact {

	int contact_id;
	String first_name;
	String last_name;
	String zip_code;
	
	
	//Contact constructor
	public Contact(Integer contact_id, String first_name, String last_name, String zip_code) {
		super();
		this.contact_id = contact_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.zip_code = zip_code;
	}
	
 
	
	//Getters and setter
	public Integer getContactId() {
		return contact_id;
	}
	public void setContactId(Integer contact_id) {
		this.contact_id = contact_id;
	}
	public String getFirstName() {
		return first_name;
	}
	public void setFirstName(String first_name) {
		this.first_name = first_name;
	}
	public String getLastName() {
		return last_name;
	}
	public void setLastName(String last_name) {
		this.last_name = last_name;
	}
	public String getZipCode() {
		return zip_code;
	}
	public void setZipCode(String zip_code) {
		this.zip_code = zip_code;
	}
}
