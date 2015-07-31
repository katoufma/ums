package ums.app.top;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MenuController {
	@RequestMapping(value="top", method=RequestMethod.GET)
	public String showMenu(){
		return "top/menu";
	}
	
	@RequestMapping(value="user/register", method=RequestMethod.GET)
	public String showRegisterForm(){
		return "user/registerForm";
	}
	
	@RequestMapping(value="user/search", method=RequestMethod.GET, params="form")
	public String showSearchForm(){
		return "user/searchForm";
	}
}
