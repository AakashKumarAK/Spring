package org.jsp.springmvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping(value="/open-home")
	public String openHomePage(Model model)
	{
		model.addAttribute("username", "virat kohli");
		return "home";
	}
	@RequestMapping("/open-view")
	public String openView(@RequestParam(name="view")String view)
	{
		return view;
	}
	@RequestMapping("/Sum")
	public String findSum(@RequestParam(name="num1")int num1,@RequestParam(name="num2")int num2,Model model)
	{
		model.addAttribute("result", num1+"+"+num2+"="+(num1+num2));
		return "print";
	}
	@RequestMapping("/Diff")
	public String findDiff(@RequestParam(name="num1")int num1,@RequestParam(name="num2")int num2,Model model)
	{
		model.addAttribute("result", num1+"-"+num2+"="+(num1-num2));
		return "print";
	}
	@RequestMapping("/Product")
	public String findProduct(@RequestParam(name="num1")int num1,@RequestParam(name="num2")int num2,Model model)
	{
		model.addAttribute("result", num1+"*"+num2+"="+(num1*num2));
		return "print";
	}
	@RequestMapping("/Quotient")
	public String findQuotient(@RequestParam(name="num1")int num1,@RequestParam(name="num2")int num2,Model model)
	{
		model.addAttribute("result", num1+"/"+num2+"="+(num1/num2));
		return "print";
	}
	@RequestMapping("/Remainder")
	public String FindRemainder(@RequestParam(name="num1")int num1,@RequestParam(name="num2")int num2,Model model)
	{
		model.addAttribute("result", num1+"%"+num2+"="+(num1%num2));
		return "print";
	}

	@RequestMapping(value = "/open-register")
	public ModelAndView openRegister()
	{
		ModelAndView modelAndview=new ModelAndView();
		modelAndview.setViewName("register");
		modelAndview.addObject("obj", new User());
		return modelAndview;
	}

	@RequestMapping(value = "/register")
	@ResponseBody
	public String register( @ModelAttribute(name ="obj") User user)
	{
		System.out.println(user);
		return "Details printed sucessfully";   
	}

}





