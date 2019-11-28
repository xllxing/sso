package com.company.service.impl;

import java.util.List;

import com.company.bean.OnlineUserInfo;
import com.company.service.ISSOTokenService;

public class SSOTokenServiceImpl implements ISSOTokenService {

	@Override
	public OnlineUserInfo getUserByToken(String token) {
		return SSOOnlineUserList.getUserByToken(token);
	}

	@Override
	public void addUserToken(String token, OnlineUserInfo user) {
		SSOOnlineUserList.putUserToken(token, user);
	}

	@Override
	public boolean isUseronline(String username) {
		return SSOOnlineUserList.isUserOnline(username);
	}

	@Override
	public List<OnlineUserInfo> getOnlineUserListByRole(int role) {
		return SSOOnlineUserList.getOnlineUserListByRole(role);
	}

	@Override
	public List<OnlineUserInfo> getAllOnlineUser() {
		return SSOOnlineUserList.getAllOnlineUser();
	}

	@Override
	public int getOnlineUserNum() {
		return SSOOnlineUserList.getOnlineUserNum();
	}

}
