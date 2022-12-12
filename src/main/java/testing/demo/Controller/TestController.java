package testing.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import testing.demo.DTO.infoDTO;
import testing.demo.Entity.Employes;
import testing.demo.Service.myService;
import testing.demo.exception.ActorNotFoundException;




@RestController
public class TestController {



	
	 @Autowired
	    private myService service;
	
	 
	
	 @GetMapping("/allemployes")
	    public List<Employes> allemployes() {
	    	
		 return service.getAllEmployes();
	    }
	 
	 
	 @PostMapping("/postemp")
	 public void setemp(@RequestBody Employes emp)
	 {
		 service.savingemp(emp);
	 }
	 
	 
	 
	 @GetMapping("/{id}")
	    public Employes getEmp(@PathVariable int id) {
		 return service.getemp(id);
	    }
	 
	 

	 
	 @PostMapping("/postemp1")
	 public Employes setemp1(@RequestBody Employes emp)
	 {
		return emp;
	 }
	 
	 
	 @DeleteMapping("/{id}")
	 public void setemp1(@PathVariable int id)
	 {
		 service.deletebyid(id);
	 }
	 
	 
	 
	 
	 
}
