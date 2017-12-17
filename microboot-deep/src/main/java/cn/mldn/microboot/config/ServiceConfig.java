package cn.mldn.microboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import cn.mldn.microboot.service.IMessageService;
import cn.mldn.microboot.service.impl.MessageServiceImpl;

//@Configuration
public class ServiceConfig {
	//@Bean // 表示在Spring中进行注册处理
	public IMessageService getMessageServiceInstance() {
		return new MessageServiceImpl() ;
	}
}
 