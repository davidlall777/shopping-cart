package com.shoppingcartapp.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.shoppingcartapp.model.Customer;
import com.shoppingcartapp.service.CustomerService;

@Controller
@RequestMapping(value="/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@InitBinder
	public void initBinder(WebDataBinder binder){
		binder.registerCustomEditor(Date.class, "dob", new CustomDateEditor(new SimpleDateFormat("dd.MM.yyyy"),false));
	}
	
	@RequestMapping(value="/get/{id},/get/*", method=RequestMethod.GET)
	public ModelAndView getCustomer(@PathVariable String customerId){
		Customer customer=null;
		try{
			customer=customerService.getCustomer(customerId,null);
		}
		catch(Exception e){e.printStackTrace();}
		return new ModelAndView("CreateOrModifyCustomer", "customer",customer);
	}
	
	
	@ModelAttribute
	public void populateCustomerList(Model model){
		try{
			model.addAttribute("customerlist",customerService.getAllCustomers());
		}
		catch(Exception e){e.printStackTrace();}
	}
	
	
	@RequestMapping(value="/createormodify.do", method=RequestMethod.POST)
	public ModelAndView createOrModifyCustomer(@ModelAttribute("customer") Customer customer, BindingResult result){
		ModelAndView mav=new ModelAndView("CreateOrModifyCustomer");
		mav.addObject("customer",customer);
		try{
			if(!result.hasErrors())
				mav.addObject("status","SUCCESS");
			else
				mav.addObject("status","FAILED");
		}
		catch(Exception e){e.printStackTrace();}
		return mav;
	}
	
	
	@RequestMapping(value="/", method={RequestMethod.GET,RequestMethod.POST})
	public String methodNotFound(){
		return "Error404";
	}
	
}
