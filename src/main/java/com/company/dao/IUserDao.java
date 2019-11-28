package com.company.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.company.bean.User;

/**
 * @author xll
 * @category 人员接口
 */
public interface IUserDao {

	/**
	 * 人员登录
	 * @param name
	 * @param pass
	 * @return
	 */
	public User login(@Param("username") String username,@Param("userpass") String userpass);
	
	/**
	 * 查询人员列表
	 * @return
	 */
	public List<User> findlist();
	
	/**
	 * 跟新
	 * @param user
	 * @return
	 */
	public int  updateUser(User user);
	
	/**
	 * 删除
	 * @param username
	 * @return
	 */
	public int deleteUserByName(String username);
	
	/**
	 * 增加
	 * @param user
	 * @return
	 */
	public int addUser(User user);
	
	
	
}
