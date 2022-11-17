package testing.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import testing.demo.Repository.InventoryRepository;

@Service
public class PurchaseDeptService {
	
	@Autowired
	private InventoryRepository repository;
	
	public PurchaseDeptService(InventoryRepository repository) {
        this.repository = repository;
    }

}
