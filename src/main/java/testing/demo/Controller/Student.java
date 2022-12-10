package testing.demo.Controller;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Student {
	
	@JsonProperty
    public String id;
	@JsonProperty
    public String name;

	@JsonProperty
    public String classname2;
	
	private String section;

	public Student() {

	}

	public Student(String id, String name,String section) {
		super();
		this.id = id;
		this.name = name;
		this.section = section;
	}

	public void getOldData()
	{
		System.out.println("old Data");
	}

	public void getNData()
	{
		System.out.println("y Data");
	}

	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
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
