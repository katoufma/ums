package umsmybatis.app.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="user")
public class UserRegistrationController {
	
	@RequestMapping(value="register", method=RequestMethod.POST, params="confirm")
	public String confirmRegistration(){
		return "user/registerConfirm";
	}
	
	@RequestMapping(value="register", method=RequestMethod.POST, params="redo")
	public String redoRegistration(){
		return "user/registerForm";
	}
	
	@RequestMapping(value="register", method=RequestMethod.POST)
	public String executeRegistration(){
		return "redirect:register?finish";
	}
	
	@RequestMapping(value="register", method=RequestMethod.GET, params="finish")
	public String completeRegistration(){
		return "user/registerFinish";
	}
}
