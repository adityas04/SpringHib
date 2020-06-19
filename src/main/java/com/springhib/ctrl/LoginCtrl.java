package com.springhib.ctrl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springhib.service.AuthService;

@Controller
@RequestMapping("/user")
public class LoginCtrl {

	@Autowired
	private AuthService authenticateService;

	private static Logger log = Logger.getLogger(LoginCtrl.class);

	@RequestMapping(value = "/validate", method = RequestMethod.POST)
	public ModelAndView validateUsr(@RequestParam("username")String username,@RequestParam("password")String password) {
		String msg = "";
		boolean isValid = authenticateService.findUser(username, password);
		log.info("Is user valid?= " + isValid);

		if(isValid) {
			msg = "Welcome " + username + "!";
		} else {
			msg = "Invalid credentials";
		}

		return new ModelAndView("result", "output", msg);
	}
}