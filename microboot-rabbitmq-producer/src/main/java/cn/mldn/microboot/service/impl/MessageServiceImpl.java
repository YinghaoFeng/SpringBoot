package cn.mldn.microboot.service.impl;

import javax.annotation.Resource;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

import cn.mldn.microboot.config.ProducerConfig;
import cn.mldn.microboot.service.IMessageService;
@Service
public class MessageServiceImpl implements IMessageService {
	@Resource
	private RabbitTemplate rabbitTemplate ;
	@Override
	public void sendMessage(String str) {
		this.rabbitTemplate.convertAndSend(ProducerConfig.EXCHANGE, ProducerConfig.ROUTINGKEY, str); 
		//this.rabbitTemplate.convertAndSend(str); 
	}

}
