package com.cg.ctrl;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cg.bean.User;
import com.cg.service.CapstoreServiceImpl;
@Controller
public class CapgeminiController {
	@Autowired
	public CapstoreServiceImpl capstoreService;
	public CapstoreServiceImpl getCapstoreService() {
		return capstoreService;
	}
	public void setCapstoreService(CapstoreServiceImpl capstoreService) {
		this.capstoreService = capstoreService;
	}
	public CapgeminiController(){
		super();
	}
	@RequestMapping(value="displayLoginPage",method=RequestMethod.GET)
	public String showAdminPage(Model model) {
		//model.addAttribute("str","HELLO");
		model.addAttribute("user",new User());
		return "login";
	}
	
	@RequestMapping(value="displayAdmin.obj",method=RequestMethod.POST)
	public String showAdminPage(Model model,@ModelAttribute(value="user") @Valid User user,BindingResult result) {
		System.out.println(user.getEmail());
		model.addAttribute("user",capstoreService.findByEmail(user.getEmail()));
		return "adminPage";
	}


}
