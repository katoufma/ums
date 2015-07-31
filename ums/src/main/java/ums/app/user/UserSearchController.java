package ums.app.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="user")
public class UserSearchController {
	
	@RequestMapping(value="search", method=RequestMethod.POST)
	public String showSearchResult(){
		return "user/searchList";
	}
}
