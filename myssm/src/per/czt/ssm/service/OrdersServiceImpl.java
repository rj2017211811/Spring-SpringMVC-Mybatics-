package per.czt.ssm.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import per.czt.ssm.dao.OrdersDao;
import per.czt.ssm.domain.Orders;
@Service("ordersService")
public class OrdersServiceImpl implements OrdersService {
	
	@Resource(name="ordersDao")
	private OrdersDao ordersDao;
	

	public OrdersDao getOrdersDao() {
		return ordersDao;
	}


	public void setOrdersDao(OrdersDao ordersDao) {
		this.ordersDao = ordersDao;
	}

	@Override
	public List<Orders> listAll() {
		
		return ordersDao.listAll();
	}

}
