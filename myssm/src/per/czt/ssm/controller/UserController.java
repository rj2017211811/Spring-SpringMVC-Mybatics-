package per.czt.ssm.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import per.czt.ssm.domain.Orders;
import per.czt.ssm.domain.User;
import per.czt.ssm.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private UserService userService;
	@RequestMapping("/listAll")
	public String listAll(Model model)
	{
		List<User> userList=userService.searchAll();
		model.addAttribute(userList);
		
		System.out.println("显示列表");
		System.out.println("记录条数:"+userList.size());
		for(User u:userList)
		{
			System.out.println("id:"+u.getId()+" oders数目:"+u.getOrdersList().size());
			
			for(Orders order:u.getOrdersList())
			{
				System.out.println("ordersId:"+order.getId());
			}
			
		}
		return "/user/userList";
	}
	@RequestMapping("/delete")
	public String delete(Integer id)
	{
		User u=new User();
		u.setId(id);
		int flag=userService.delete(u);
		if(flag==1)
		{
			System.out.println("删除成功");
		}
		else
		{
			System.out.println("删除失败");
		}
		return "redirect:/user/listAll";
	}
	
	
	@RequestMapping("/toAdd")
	public String toAdd()
	{
		
		return "/user/userAdd";
	}
	
	@RequestMapping("/add")
	public String add(String username,String password)
	{
		User u=new User();
		u.setUsername(username);
		u.setPassword(password);
		int flag=userService.insert(u);
		if(flag==1)
		{
			System.out.println("增加成功");
		}
		else
		{
			System.out.println("增加失败");
		}
		return "redirect:/user/listAll";
	}
	
	@RequestMapping("/toUpdate")
	public String toUpdate(Integer id,Model model)
	{
		User u=new User();
		u.setId(id);
	
		model.addAttribute(u);
		return "/user/userUpdate";
	}
	
	@RequestMapping("/update")
	public String update(User user,Model model)
	{
		
	
		int flag=userService.update(user);
		if(flag==1)
		{
			System.out.println("更新成功");
		}
		else
		{
			System.out.println("更新失败");
		}
		return "redirect:/user/listAll";
	}
	
}
