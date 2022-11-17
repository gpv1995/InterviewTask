package testing.demo.DTO;

import testing.demo.Entity.Employes;

public class infoDTO {
	
	private Employes emp;
	
	private String name;
	


	infoDTO(){
		
	}
	
	
	public infoDTO(Employes em,String name)
	{
		this.emp = em;
		this.name = name;	
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	
	public Employes getEmp() {
		return emp;
	}

	public void setEmp(Employes emp) {
		this.emp = emp;
	}


}
