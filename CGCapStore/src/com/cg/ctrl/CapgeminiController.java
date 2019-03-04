package com.cg.ctrl;
import java.util.List;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.cg.bean.User_details;
import com.cg.service.CapstoreService;
import com.cg.service.CapstoreServiceImpl;
@Controller
public class CapgeminiController {
	@Autowired
	public CapstoreService capstoreService;
	public CapstoreService getCapstoreService() {
		return capstoreService;
	}
	public void setCapstoreService(CapstoreService capstoreService) {
		this.capstoreService = capstoreService;
	}
	public CapgeminiController(){
		super();
	}
	@RequestMapping(value="displayLoginPage",method=RequestMethod.GET)
	public String showAdminPage(Model model) {
		model.addAttribute("user",new User_details());
		return "login";
	}
	
	@RequestMapping(value="displayAdmin",method=RequestMethod.POST)
	public String showAdminPage(Model model,@ModelAttribute(value="user") @Valid User_details user,BindingResult result) {
		System.out.println("user email is :"+user.getEmail());
		User_details user_details = capstoreService.findByEmail(user.getEmail());
		System.out.println("user details is :"+user_details);
		System.out.println("user details is :"+user_details.getUser_type());
		model.addAttribute("userdetail",user_details);
		if(user_details.getUser_type().equals("Admin")) {
			List<User_details> customerDetails = capstoreService.getAllCustomers();
			capstoreService.
			model.addAttribute("allCustomers",customerDetails);
			model.addAttribute("ThirdPartyMerchant",capstoreService.getAllThirdPartyMerchants());
			model.addAttribute("inHouseMerchant", capstoreService.getAllInHouseMerchants());
			return "adminPage";
		}
		return "Error";
	}


}
