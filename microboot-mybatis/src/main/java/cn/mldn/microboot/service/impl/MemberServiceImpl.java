package cn.mldn.microboot.service.impl;

import org.springframework.stereotype.Service;

import cn.mldn.microboot.service.IMemberService;
@Service 
public class MemberServiceImpl implements IMemberService {

	@Override
	public void add() {
		System.err.println("【*** MemberService ***】增加新用户信息。");
	}

}
