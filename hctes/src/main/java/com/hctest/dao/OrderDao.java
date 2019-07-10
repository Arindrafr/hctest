package com.hctest.dao;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hctest.model.OrderModel;

@Repository
public class OrderDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public OrderModel getOrder(int id) {
		try {
			String sql = "select id,orderName from `order` where id=?";
			List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql, new Object[] {id});
			OrderModel om = new OrderModel();
			for (Map<String, Object> row : rows) {
				om.setOrderName((String) row.get("orderName"));
				om.setOrderNumber((int) row.get("id"));
			}
			return om;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public String getUserOrder(String userName) {
		try {
			String sql = "select userOrder from user_order where userName=?";
			Map map = jdbcTemplate.queryForMap(sql,userName);
			return (String) map.get("userOrder");
		}catch(Exception e) {
			e.printStackTrace();
			return "";
		}
	}
}
