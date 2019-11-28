package com.company.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.company.bean.User;
import com.company.dao.IUserDao;
import com.company.service.IUserService;

/**
 * @author xll
 * @category 用户业务实现类
 */
@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	IUserDao userDao;

	@Override
	public User login(String username, String userpass) {
		return userDao.login(username, userpass);
	}

	@Override
	public List<User> findlist() {
		return userDao.findlist();
	}

	@Override
	public boolean updateUser(User user) {
		return userDao.updateUser(user)>0;
	}

	@Override
	public boolean deleteUserByName(String username) {
		return userDao.deleteUserByName(username)>0;
	}

	@Override
	public boolean addUser(User user) {
		return userDao.addUser(user)>0;
	}
	
	

}
