package cn.mldn.microboot.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.mldn.microboot.restful.vo.Member;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@RestController
public class MemberController {
	@ApiOperation(value = "获取全部用户信息", notes = "将获取全部的数据，不需要传递任何的参数")
	@RequestMapping(value="/member/list",method=RequestMethod.GET)
	public Object list() {
		List<Member> allMembers = new ArrayList<Member>();
		for (int x = 0; x < 5; x++) {
			Member vo = new Member();
			vo.setMid("mldn - " + x);
			vo.setName("用户姓名 - " + x);
			vo.setAge(20 + x);
			vo.setBirthday(new Date());
			vo.setDeptno(10L + x);
			vo.setSalary(99.99 + x);
			allMembers.add(vo);
		}
		return allMembers;
	}

	@ApiOperation(value = "获取指定编号的人员信息", notes = "只需要设置mid的信息就可以获取Member完整内容")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "mid", value = "用户编号", required = true, dataType = "String")})
	@RequestMapping(value="/member/get",method=RequestMethod.GET)
	public Object get(String mid) { 
		Member vo = new Member();
		vo.setMid(mid);
		vo.setName("用户姓名 - " + mid);
		vo.setAge(20);
		vo.setBirthday(new Date());
		vo.setDeptno(10L);
		vo.setSalary(99.99);
		return vo;
	}

}
