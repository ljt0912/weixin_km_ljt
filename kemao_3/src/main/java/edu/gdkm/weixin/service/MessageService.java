package edu.gdkm.weixin.service;

import edu.gdkm.weixin.domain.InMessage;
import edu.gdkm.weixin.domain.OutMessage;

public interface MessageService {

	OutMessage onMessage(InMessage msg);
}
