package cn.mldn.microboot.listener;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumerListener {
	@KafkaListener(topics= {"mldn-microboot"})
	public void recevieMessage(ConsumerRecord<String, String> record) {
		System.err.println("【*** 接收消息 ***】key = " + record.key() + "、value = " + record.value());
	}
}
