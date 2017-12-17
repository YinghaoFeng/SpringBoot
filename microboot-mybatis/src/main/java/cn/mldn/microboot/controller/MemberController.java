package cn.mldn.microboot.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.mldn.microboot.service.IMemberService;
import cn.mldn.microboot.vo.Member;
@Controller 
public class MemberController {
	@Resource
	private IMemberService memberService ;
	@RequestMapping("/member_input")
	public String input() {
		return "back/admin/member/member_input" ; 
	}
	@RequestMapping("/member_show")
	public String show(Model model,Member mem) {
		this.memberService.add();
		Map<Long,String> deptMap = new HashMap<Long,String>() ;
		deptMap.put(10L, "财务部") ;
		deptMap.put(20L, "销售部") ;
		model.addAttribute("allDepts", deptMap) ;
		model.addAttribute("member", mem) ;
		return "back/admin/member/member_show" ;    
	}
	

}
