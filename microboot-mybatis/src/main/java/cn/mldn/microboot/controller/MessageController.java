package cn.mldn.microboot.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller 
public class MessageController {
	
	
	@RequestMapping("/message")
	public String message(Model model,HttpServletRequest request) {
		model.addAttribute("title", "<span style='color:red'>后天休息了，假的！</span>") ;
		request.setAttribute("msg", "<span style='color:green'>约翰乃由的爱情！</span>"); 
		return "message/message_show" ;   
	}
}
