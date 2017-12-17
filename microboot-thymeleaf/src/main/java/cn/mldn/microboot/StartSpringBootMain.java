package cn.mldn.microboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
 
@ImportResource(locations= {"classpath:spring/spring-*.xml"}) 
@SpringBootApplication
public class StartSpringBootMain {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(StartSpringBootMain.class, args); 
	}
}
