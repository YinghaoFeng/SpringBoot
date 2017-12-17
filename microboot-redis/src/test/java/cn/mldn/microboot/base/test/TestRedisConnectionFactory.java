package cn.mldn.microboot.base.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import cn.mldn.microboot.StartSpringBootMain;

@RunWith(SpringJUnit4ClassRunner.class) 
@WebAppConfiguration // 现在要使用一个WEB程序启动
@SpringBootTest(classes = StartSpringBootMain.class) // 定义要测试的程序类
public class TestRedisConnectionFactory {
	@Resource
	private JedisConnectionFactory connectionFactory ;
	@Test
	public void testSet() {
		RedisConnection conn = this.connectionFactory.getConnection() ;
		System.err.println(conn);
		conn.close(); 
	}
}
