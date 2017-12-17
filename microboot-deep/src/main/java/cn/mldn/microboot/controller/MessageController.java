package cn.mldn.microboot.controller;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import cn.mldn.microboot.service.IMessageService;
@Controller
public class MessageController {
	@Resource
	private MessageSource messageSource ;
	
	@Resource
	private IMessageService messageService;
	
	
	@RequestMapping("/show")
	public String show(Model model) {  // 传递参数
		System.err.println(10 / 0); // 出现500错误
		model.addAttribute("msg", this.messageService.echo()) ;
		return "message/message_show" ;   // 要跳转的路径
	}
	
	//@RequestMapping("/error")
	@ResponseBody
	public Object error() {
		return "出错啦。" ;
	}
	
	@RequestMapping("/msg")
	@ResponseBody
	public String welcome() {
		return this.messageService.echo() ;  
	}
	
	
	@RequestMapping("/i18n/{message}")
	@ResponseBody
	public String i18nMsg(@PathVariable("message") String msg) {
		return this.messageSource.getMessage("welcome.msg", new Object[]{"【"+msg+"】"}, Locale.CANADA) ;
	}
	
	@RequestMapping("/echo/{message}")
	@ResponseBody
	public String echo(@PathVariable("message") String msg) {
		return "【ECHO返回】" + msg ;
	}
	
	@RequestMapping("/inner1")
	@ResponseBody 
	public Object innerObject(HttpServletRequest request,HttpServletResponse response) {
		Map<String,String> map = new HashMap<String,String>() ;
		map.put("request-contextPath", request.getContextPath()) ;
		map.put("session-id", request.getSession().getId()) ;
		map.put("application-realPath", request.getServletContext().getRealPath("/")) ;
		map.put("response-contentType", response.getContentType()) ;
		return map ;
	}
	
	@RequestMapping("/inner2")
	@ResponseBody 
	public Object innerObject() {
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest() ;
		HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse() ;
		Map<String,String> map = new HashMap<String,String>() ;
		map.put("request-contextPath", request.getContextPath()) ;
		map.put("session-id", request.getSession().getId()) ;
		map.put("application-realPath", request.getServletContext().getRealPath("/")) ;
		map.put("response-contentType", response.getContentType()) ;
//		HttpServletResponse response1 = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse() ;
//		HttpServletRequest request1 = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest() ;
		return map ;
	}
	 
	@RequestMapping("/message")
	@ResponseBody
	public String message(String mid) {
		return "【返回用户编号】" + mid ;  
	}
}
