package com.nikJ.test.login.dao;

import org.springframework.stereotype.Repository;

import com.nikJ.test.login.vo.UserVo;

@Repository
public class UserDao{
	
	public UserVo userDetail(){
		
		UserVo userVo = new UserVo();
		
		userVo.setUserId("test");
		userVo.setPassword("test2");
		
		return userVo;
	}
	
	
	
}
