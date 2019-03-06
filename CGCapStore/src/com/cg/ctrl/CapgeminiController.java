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
import com.cg.bean.Merchant;
import com.cg.bean.User_details;
import com.cg.service.CapstoreService;
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
		System.out.println("user details");
		System.out.println("are :-......................."+user.toString());
		User_details user_details = capstoreService.findByEmail(user.getEmail());
		model.addAttribute("userdetail",user_details);
		if(user_details.getUser_type().equals("Admin")) {
			List<User_details> customerDetails = capstoreService.getAllCustomers();
			System.out.println("customer details are: .............."+customerDetails);
			for (User_details customer : customerDetails)
				customer.setAddress(capstoreService.getCustomerAddress(customer.getUser_id()));
			//System.out.println(customerDetails);
			model.addAttribute("allCustomers",customerDetails);
			List<Merchant> thirdMerchant = capstoreService.getAllThirdPartyMerchants();
			model.addAttribute("ThirdPartyMerchant",thirdMerchant);
			List<Merchant> inHouseMerchant = capstoreService.getAllInHouseMerchants();
			model.addAttribute("inHouseMerchants", inHouseMerchant);
			return "adminPage";
		}
		return "Error";
	}
}