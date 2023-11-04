package com.example.demo.controller;

import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.CountedCompleter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.pojo.entity.User;
import com.example.demo.pojo.vo.UserVo;
import com.example.demo.service.UserServiceIf;


@Controller
@RequestMapping("/form")
public class UserController
{
	@Autowired
	private UserServiceIf userServiceIf;
	
//	@GetMapping("/test")
//	@ResponseBody
//	public List<User> test()
//	{
//		List<User> list=userServiceIf.getAllUsers();
//		return list;
//	}
	@GetMapping
	public String index(Model model)
	{
		List<User> list=userServiceIf.getAllUsers();
		model.addAttribute("userList", list);
		model.addAttribute("title","Index");
		return "index";
	}
	@GetMapping("/input")
	public String get_input(UserVo userVo, Model model,@ModelAttribute("complete") String complete_value)
	{
		model.addAttribute("title","input form[get]");
		return "forms/input_form";
	}
	@PostMapping("/input")
	public String post_input(UserVo userVo, Model model)
	{
		model.addAttribute("title","input form[get]");
		return "forms/input_form";
	}
	@PostMapping("/confirm")
	public String confirm(@Validated UserVo userVo,BindingResult result, Model model)
	{
		if(result.hasErrors())
		{
			model.addAttribute("title","input form[Go Back Form Confirm");
			return "forms/input_form";
		}
		model.addAttribute("title","confirm form");
		return "forms/confirm";
	}
	@PostMapping("/complete")
	public String complete(@Validated UserVo userVo,BindingResult result,Model model,RedirectAttributes redirectAttributes)
	{
		if(result.hasErrors())
		{
			model.addAttribute("title","input form(Go Back From Complete");
			return "forms/input_form";
		}
		User user=new User();
		user.setName(userVo.getName());
		user.setEmail(userVo.getEmail());
		user.setContents(userVo.getContents());
		user.setCreated(LocalDateTime.now());
		int i=userServiceIf.addUserToMysql(user);
		if(i>0)System.out.println("insert ok");
		else System.out.println("insert failed");
		redirectAttributes.addFlashAttribute("complete","Registered");
		return "redirect:/form/input";
	}
}
