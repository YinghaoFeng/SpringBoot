package cn.mldn.microboot.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration 
public class ConsumerConfig {
	public static final String EXCHANGE = "mldn.microboot.exchange" ;
	public static final String ROUTINGKEY = "mldn.microboot.routingkey" ;
	public static final String QUEUE_NAME = "mldn.microboot.queue" ;
	@Bean
	public DirectExchange getDriectExchange() { // 绑定Exchange
		return new DirectExchange(EXCHANGE) ; 
	}
	@Bean
	public Queue getQueue() {
		return new Queue(QUEUE_NAME) ;
	}
	@Bean
	public Binding bindingExchangeQueue(DirectExchange exchange,Queue queue) {	// 绑定要进行的交换空间与队列关系
		return BindingBuilder.bind(queue).to(exchange).with(ROUTINGKEY) ;
	}
}
