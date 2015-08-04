package umsmybatis.app.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="user")
public class UserUpdateController {
	
	//TODO modify RequestMapping: GET, params=form&userId=xxx
	@RequestMapping(value="update", method=RequestMethod.POST, params="userId")
	public String showUpdateForm(){
		return "user/updateForm";
	}
	
	@RequestMapping(value="update", method=RequestMethod.POST, params="confirm")
	public String confirmUpdate(){
		return "user/updateConfirm";
	}
	
	@RequestMapping(value="update", method=RequestMethod.POST, params="redo")
	public String redoUpdate(){
		return "user/updateForm";
	}
	
	@RequestMapping(value="update", method=RequestMethod.POST)
	public String executeUpdate(){
		return "redirect:update?finish";
	}
	
	@RequestMapping(value="update", method=RequestMethod.GET)
	public String fnishUpdate(){
		return "user/updateFinish";
	}
}
