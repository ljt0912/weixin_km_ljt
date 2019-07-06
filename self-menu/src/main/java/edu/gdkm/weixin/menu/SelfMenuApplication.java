package edu.gdkm.weixin.menu;

import edu.gdkm.weixin.EventListenerConfig;
import edu.gdkm.weixin.domain.event.EventInMessage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("edu.gdkm")
@EntityScan("edu.gdkm")
public class SelfMenuApplication implements EventListenerConfig {

	public static void main(String[] args) {
		SpringApplication.run(SelfMenuApplication.class, args);
	}

	@Override
	public void handleEvent(EventInMessage event) {
		// 不处理事件，方法留空
	}
}
