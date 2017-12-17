package cn.mldn.microboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import cn.mldn.microboot.interceptor.DefaultInterceptor;
@Configuration
public class MyWebApplicationConfig extends WebMvcConfigurerAdapter {
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new DefaultInterceptor()) ;
		super.addInterceptors(registry);
	}
}
