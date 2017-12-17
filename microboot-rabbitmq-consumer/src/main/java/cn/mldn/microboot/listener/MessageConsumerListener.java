package cn.mldn.microboot.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumerListener {
	@RabbitListener(queues="mldn.microboot.queue")
	public void receviveMessge(String text) {
		System.err.println("【*** 接收消息 ***】" + text);
	}
}
