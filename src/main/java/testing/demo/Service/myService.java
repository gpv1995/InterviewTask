package testing.demo.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import testing.demo.DTO.infoDTO;
import testing.demo.Entity.Employes;
import testing.demo.Repository.EmployeeRepo;
import testing.demo.exception.ActorNotFoundException;
import testing.demo.nosuchbeanexp.IbeanB;


@Service
public class myService {
	
	private int a =10;
	
	
	 Logger logger = LoggerFactory.getLogger(myService.class);

	 @Autowired
	    private EmployeeRepo repository;
	 
	 
	 
	 @Autowired
     private IbeanB IbeanBimp1;
	     

            // getAllEmployes
	    public List<Employes> getAllEmployes() {
	    	return repository.findAll();
	    	}
	    
	    
	    
	    public Employes savingemp(Employes empss){	    	
	    	return repository.save(empss);
	    }
	    
	    public Employes getemp(int id){
	    	Employes emp = new Employes();
	    	Optional<Employes> e =	repository.findById(id);
	    	if(e.isPresent())
	    	{
	             emp = e.get();
	             return emp;
	    	}
	    	else
	    	{
	    	 throw new ActorNotFoundException();
	    	}
			
	    }
	    
	    public void deletebyid(int id)
	    {
	    	repository.deleteById(id);
	    }

		public void test123(){
			System.out.println("tettttt");
		}


}
