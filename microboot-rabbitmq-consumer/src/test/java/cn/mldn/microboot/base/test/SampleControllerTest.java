package cn.mldn.microboot.base.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import cn.mldn.microboot.StartSpringBootMain;

@RunWith(SpringJUnit4ClassRunner.class) 
@WebAppConfiguration // 现在要使用一个WEB程序启动
@SpringBootTest(classes = StartSpringBootMain.class) // 定义要测试的程序类
public class SampleControllerTest {
	@Test
	public void test() throws Exception {
		Thread.sleep(Long.MAX_VALUE);
	}
}
