package klu.model;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import klu.repository.OrderRepository;

@Service
public class OrdersManager {
	@Autowired
	OrderRepository OR;
	
	public String addOrders(Orders F)
	{		
			OR.save(F); //INSERT OPERATION		
			return "Orders Sucessfully inserted!";

	}
	public String deleteOrders(Long id) {
		OR.deleteById(id);//delete operation
		
		return "Orders has sucessfully deleted!";
		
	}
}
