package com.hctest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hctest.dao.OrderDao;
import com.hctest.model.OrderModel;

@Service
public class OrderService {
	
	@Autowired
	private OrderDao od;
	
	public OrderModel getOrder(int id) {
		return od.getOrder(id);
	}
	
	public String getUserOrder(String userName) {
		return od.getUserOrder(userName);
	}

}
