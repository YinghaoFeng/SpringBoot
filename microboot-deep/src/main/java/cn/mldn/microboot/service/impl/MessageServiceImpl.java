package cn.mldn.microboot.service.impl;

import org.springframework.stereotype.Service;

import cn.mldn.microboot.service.IMessageService;
//@Service  //加不加都行
public class MessageServiceImpl implements IMessageService {
	@Override
	public String echo() {
		return "www.mldn.cn" ;
	}
 
}
