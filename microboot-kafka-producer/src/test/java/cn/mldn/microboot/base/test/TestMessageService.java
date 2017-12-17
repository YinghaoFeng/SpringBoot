package cn.mldn.microboot.base.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import cn.mldn.microboot.StartSpringBootMain;
import cn.mldn.microboot.service.IMessageService;

@RunWith(SpringJUnit4ClassRunner.class) 
@WebAppConfiguration // 现在要使用一个WEB程序启动
@SpringBootTest(classes = StartSpringBootMain.class) // 定义要测试的程序类
public class TestMessageService {
	static {
		System.setProperty("java.security.auth.login.config",
				"G:/Users/FYH/kafka_jaas/kafka_client_jaas.conf");
	}
	@Resource
	private IMessageService messageService ;
	@Test
	public void send() {
		for (int x = 0 ; x < 1000 ; x ++) {
			this.messageService.send("www.mldn.cn");
		}
	}
}
