package cn.mldn.microboot.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.mldn.microboot.vo.Member;
@Controller 
public class MemberController {
	@RequestMapping("/member_show")
	public String show(Model model) {
		Member mem = new Member() ;
		mem.setMid("mldnjava");
		mem.setName("海露");
		mem.setDeptno(10L);
		mem.setAge(10); 
		mem.setSalary(1.1);
		mem.setBirthday(new Date()); 
		Map<Long,String> deptMap = new HashMap<Long,String>() ;
		deptMap.put(10L, "财务部") ;
		deptMap.put(20L, "销售部") ;
		model.addAttribute("allDepts", deptMap) ;
		model.addAttribute("member", mem) ;
		return "back/admin/member/member_show" ;    
	}
	@RequestMapping("/member_list")
	public String list(Model model) {
		Map<String,Member> allMembers = new HashMap<String,Member>() ;
		for (int x = 0 ; x < 3 ; x ++) {
			Member mem = new Member() ;
			mem.setMid("mldnjava");
			mem.setName("海露");
			mem.setDeptno(10L);
			mem.setAge(10); 
			mem.setSalary(1.1);
			mem.setBirthday(new Date()); 
			allMembers.put("mem-" + x, mem) ;
		}
		model.addAttribute("allMembers", allMembers) ; 
		return "back/admin/member/member_list" ;
	} 
	

}
