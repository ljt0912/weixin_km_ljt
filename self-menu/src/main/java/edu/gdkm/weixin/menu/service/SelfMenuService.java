package edu.gdkm.weixin.menu.service;

import edu.gdkm.weixin.menu.domain.SelfMenu;

public interface SelfMenuService {

	SelfMenu findMenus();

	void save(SelfMenu menu);

}
