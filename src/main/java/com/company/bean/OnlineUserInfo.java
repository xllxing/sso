package com.company.bean;

import java.io.Serializable;

/**
 * @author xll @category
 */
public class OnlineUserInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	private String token;
	private String username;
	private int role;
	private long lastReseTime = 0;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	public long getLastReseTime() {
		return lastReseTime;
	}

	public void setLastReseTime(long lastReseTime) {
		this.lastReseTime = lastReseTime;
	}

}
