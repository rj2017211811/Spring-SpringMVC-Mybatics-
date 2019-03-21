package per.czt.ssm.dao;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import per.czt.ssm.domain.Orders;
@Repository("ordersDao")
public class OrdersDaoImpl extends SqlSessionDaoSupport implements OrdersDao{

	@Override
	public List<Orders> listAll() {
		
		return this.getSqlSession().selectList("per.czt.ssm.domain.searchOrders", null);
	}
	
}
