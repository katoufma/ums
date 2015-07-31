package ums.app.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="user")
public class UserDeleteController {
	//TODO modify RequestMapping: GET, params=form&userId=xxx
	@RequestMapping(value="delete", method=RequestMethod.POST, params="userId")
	public String showdeleteForm(){
		return "user/deleteForm";
	}
	
	@RequestMapping(value="delete", method=RequestMethod.POST, params="confirm")
	public String confirmdelete(){
		return "user/deleteConfirm";
	}
	
	@RequestMapping(value="delete", method=RequestMethod.POST, params="redo")
	public String redodelete(){
		return "user/deleteForm";
	}
	
	@RequestMapping(value="delete", method=RequestMethod.POST)
	public String executedelete(){
		return "redirect:delete?finish";
	}
	
	@RequestMapping(value="delete", method=RequestMethod.GET)
	public String fnishdelete(){
		return "user/deleteFinish";
	}
}
