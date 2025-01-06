package contactify;

public class Contact {

	Integer contact_id;
	String first_name;
	String last_name;
	String zip_code;
	
	
	public Contact(Integer contact_id, String first_name, String last_name, String zip_code) {
		super();
		this.contact_id = contact_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.zip_code = zip_code;
	}
	
	public Contact(Integer contact_id, String first_name) {
		this.contact_id = contact_id;
		this.first_name = first_name;
	}
	
	
	public Integer getContact_id() {
		return contact_id;
	}
	public void setContact_id(Integer contact_id) {
		this.contact_id = contact_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getZip_code() {
		return zip_code;
	}
	public void setZip_code(String zip_code) {
		this.zip_code = zip_code;
	}
	
	
	
}
