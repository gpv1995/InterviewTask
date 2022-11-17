package testing.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employes {

	@Id
	@GeneratedValue
	private Integer empId;
	
	
	private String name;
	
	
	private String age;


	public Employes(){
		
		
	}
	
    public Employes(Integer empId,String name,String age){
		this.empId = empId;
		this.name = name;
		this.age = age;
	}
	
	public Integer getEmpId() {
		return empId;
	}


	public void setEmpId(Integer empId) {
		this.empId = empId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}
	
	
	@Override
	public String toString()
	{
		return "empId : "+this.empId+" age : "+this.age+" name : "+this.name;
	}
	
	
	
}
