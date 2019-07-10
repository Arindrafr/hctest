package com.hctest.endpoint;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hctest.dto.ResponseListDto;
import com.hctest.model.OrderModel;
import com.hctest.model.enumdto.ResponseCode;
import com.hctest.service.OrderService;

@Component
@Path("/order")
public class OrderEndPoint {

	@Autowired
	private OrderService os;
	
	@GET
	@Path("{user}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getOrder(@PathParam("user") String userName) {
		
		
		String orderNumber = os.getUserOrder(userName);
		
		String[]arr = orderNumber.split(",");
	
		List<Object> list = new ArrayList<>();
		OrderModel om = new OrderModel();
		for(int i=0; i<arr.length; i++) {
			om = os.getOrder(Integer.valueOf(arr[i]));
			list.add(om);
		}
		
		
		ResponseListDto response = new ResponseListDto();
		response.setMessage("sukses");
		response.setStatus("sukses");
		response.setData(list);
		response.setStatusCode(ResponseCode.SUCCESS.getValue());
		return Response.status(ResponseCode.SUCCESS.getValue()).entity(response).build();
	}
}
