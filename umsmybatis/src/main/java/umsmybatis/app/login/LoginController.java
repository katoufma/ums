package umsmybatis.app.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	
	@RequestMapping(value="login", method=RequestMethod.GET)
	public String login(){
		return "/login/loginForm";
	}
	
	@RequestMapping(value="login", method=RequestMethod.POST)
	public String login(String mock){
		return "/top/menu";
	}
}
