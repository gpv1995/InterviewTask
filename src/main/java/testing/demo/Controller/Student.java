package testing.demo.Controller;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Student {
	
	@JsonProperty
    public String id;
	@JsonProperty
    public String name;
    
    public Student() {
    	
    }
	public Student(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    
    
}
