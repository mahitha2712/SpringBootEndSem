package klu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import klu.model.Orders;
import klu.model.OrdersManager;




@RestController
@RequestMapping("/order")

public  class OrdersController {
	@Autowired
	OrdersManager OM;
	
	
	
	
	
	
	@PostMapping("/save")
	public String saveFaculty(@RequestBody Orders F)
	{
		return OM.addOrders(F);
	}
	@DeleteMapping("/delete")
	//@GetMapping("/delete")
	public String deleteOrder(@RequestParam("ID")Long id) {
		return OM.deleteOrders(id);
	}
}
