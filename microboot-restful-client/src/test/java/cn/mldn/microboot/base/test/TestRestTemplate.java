package cn.mldn.microboot.base.test;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.client.RestTemplate;

import cn.mldn.microboot.StartSpringBootMain;
import cn.mldn.microboot.restful.vo.Member;

@RunWith(SpringJUnit4ClassRunner.class) 
@WebAppConfiguration // 现在要使用一个WEB程序启动
@SpringBootTest(classes = StartSpringBootMain.class) // 定义要测试的程序类
public class TestRestTemplate {
	public static final String MEMBER_GET_URL = "http://localhost:8080/member/get?mid=" ;
	public static final String MEMBER_LIST_URL = "http://localhost:8080/member/list" ;
	@Resource
	private RestTemplate restTemplate ; 
	@Test
	public void testList() {
		List<Member> allMembers = this.restTemplate.getForObject(MEMBER_LIST_URL, List.class) ;
		System.err.println(allMembers);
	}
	@Test
	public void testGet() {
		Member obj = this.restTemplate.getForObject(MEMBER_GET_URL + "mldnjava", Member.class) ;
		System.err.println(obj);
	}
}
