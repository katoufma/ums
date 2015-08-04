package umsmybatis.app.password;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("password")
public class PasswordController {
	@RequestMapping(value="change", method=RequestMethod.POST, params="form")
	public String showPasswordChangeForm(String mock){
		return "password/changeForm";
	}
	
	@RequestMapping(value="change", method=RequestMethod.POST)
	public String executePasswordChange(String mock){
		return "redirect:change?finish";
	}
	
	@RequestMapping(value="change", method=RequestMethod.GET, params="finish")
	public String finishPasswordChange(String mock){
		return "password/passwordFinish";
	}
}
