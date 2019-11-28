package com.company.service;

import java.util.List;

import com.company.bean.OnlineUserInfo;

/**
 * @author xll
 * 
 */
public interface ISSOTokenService {

public OnlineUserInfo getUserByToken(String token);
	
	public void addUserToken(String token,OnlineUserInfo user);
	
	public boolean isUseronline(String username);
	
	public List<OnlineUserInfo> getOnlineUserListByRole(int role);
	
	public List<OnlineUserInfo> getAllOnlineUser();
	
	public int getOnlineUserNum();
	
}
