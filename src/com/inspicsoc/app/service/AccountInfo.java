package com.inspicsoc.app.service;

import com.inspicsoc.app.model.UserBean;

public interface AccountInfo{
	public int login(String username,String password);
	public int logout(String username);
	public int register(UserBean userBean);
	public UserBean checkInfo(String username);
	public UserBean editInfo(String username);
	
}
