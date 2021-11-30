package co.nero.prj.admin.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {
	
	@RequestMapping("/main.do")
	public String main() {
		
		return "admin/1/dashboard";
	}

}
