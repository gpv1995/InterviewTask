package testing.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import testing.demo.Entity.Employes;


@Repository
public interface EmployeeRepo extends JpaRepository<Employes,Integer> {
   
//	  Employes findById(int i); 
////	 
//      void delById(int j); 
//
//	List<Employes> findByName(String name);
	  
	  
}
