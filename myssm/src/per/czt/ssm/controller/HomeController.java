package per.czt.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/home")
	public String goHome()
	{
		System.out.println("Í¨¹ýÁËhomeController");
		return "index";
	}

}
