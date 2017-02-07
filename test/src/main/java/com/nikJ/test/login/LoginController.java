package com.nikJ.test.login;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nikJ.test.login.service.UserService;
import com.nikJ.utils.Spring_Security.User;

@Controller
public class LoginController {

	@Autowired
	UserService userService;
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
    
    /**
     * Simply selects the home view to render by returning its name.
     */
    @RequestMapping(value = "login", method = RequestMethod.GET)
    public void login(HttpSession session) {
        logger.info("Welcome login! {}", session.getId());
//        return "/login";
    }
     
    @RequestMapping(value = "logout", method = RequestMethod.GET)
    public void logout(HttpSession session) {
    	User userDetails = (User)session.getAttribute("userLoginInfo");
         
        logger.info("Welcome logout! {}, {}", session.getId(), userDetails.getUsername());
         
         
        session.invalidate();
    }
     
    @RequestMapping(value = "login_success", method = RequestMethod.GET)
    public void login_success(HttpSession session) {
    	User userDetails = (User)SecurityContextHolder.getContext().getAuthentication().getDetails();
         
        logger.info("Welcome login_success! {}, {}", session.getId(), userDetails.getUsername() + "/" + userDetails.getPassword());
        session.setAttribute("userLoginInfo", userDetails);
    }
     
    @RequestMapping(value = "page1", method = RequestMethod.GET)
    public void page1() {      
    }
     
    @RequestMapping(value = "login_duplicate", method = RequestMethod.GET)
    public void login_duplicate() {    
        logger.info("Welcome login_duplicate!");
    }


}
