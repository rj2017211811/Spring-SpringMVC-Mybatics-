package per.czt.ssm.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import per.czt.ssm.domain.Orders;
import per.czt.ssm.domain.User;
import per.czt.ssm.service.OrdersService;

@Controller
@RequestMapping("/orders")
public class OrdersController {
	
	@Resource
	private OrdersService ordersService;
	
	
	@RequestMapping("/listAll")
	public String listAll(Model model)
	{
		System.out.println("OrdersController");
		List<Orders> ordersList=ordersService.listAll();
		System.out.println(ordersList.size());
		
		for(Orders order:ordersList)
		{
			System.out.println("id:"+order.getId()+" "+"userId:"+order.getUser().getId());
			User u=order.getUser();
			//System.out.println("order.getUserId():"+order.getUserId());
			System.out.println("u.username:"+u.getUsername());
			System.out.println("u.password:"+u.getPassword());
		}
		System.out.println("ordersList.size():"+ordersList.size());
		model.addAttribute(ordersList);
		
		return "/orders/ordersList";
	}

}
