package sms.form;

public class ExpansesFormBean {

	private int id;
	private String name;
	private String expanse;
	private String description;
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getExpanse() {
		return expanse;
	}
	public void setExpanse(String expanse) {
		this.expanse = expanse;
	}
	
}
