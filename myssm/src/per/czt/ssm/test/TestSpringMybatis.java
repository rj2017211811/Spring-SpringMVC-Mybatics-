package per.czt.ssm.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import per.czt.ssm.domain.User;
import per.czt.ssm.service.UserService;

public class TestSpringMybatis {
	private static UserService userService;
	static
	{
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		userService=(UserService) ac.getBean("userService");
	}
	public static void listAll()
	{
		List<User> userList=userService.searchAll();
		System.out.println("size:"+userList.size());
		for(User u:userList)
		{
			System.out.println("id:"+u.getId()+" "+"username:"+u.getUsername()+" "+"password:"+u.getPassword());
		}
	}
	public static void main(String []args)
	{
		listAll();
	}
	
}
