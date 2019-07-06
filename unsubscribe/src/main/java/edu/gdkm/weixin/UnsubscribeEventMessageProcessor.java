package edu.gdkm.weixin;

import java.util.Date;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.gdkm.weixin.domain.User;
import edu.gdkm.weixin.domain.event.EventInMessage;
import edu.gdkm.weixin.processors.EventMessageProcessor;
import edu.gdkm.weixin.repository.UserRepository;



// 把Bean加入容器管理，默认类名首字母小写作为ID
// 如果@Service注解有值则表示自定义ID
@Service("unsubscribeMessageProcessor")
public class UnsubscribeEventMessageProcessor implements EventMessageProcessor {

	private static final Logger LOG = LoggerFactory.getLogger(UnsubscribeEventMessageProcessor.class);

	@Autowired
	private UserRepository userRepository;

	@Override
	@Transactional // 要有事务支持，在事务结束后，默认自动提交数据的修改
	public void onMessage(EventInMessage event) {

		if (!event.getEvent().equals("unsubscribe")) {
			// 只处理关注事件
			return;
		}
		LOG.trace("取消关注事件处理器被调用，收到的消息:\n {} ", event);

		User user = this.userRepository.findByOpenId(event.getFromUserName());
		user.setStatus(User.Status.IS_UNSUBSCRIBED);
	}
}
