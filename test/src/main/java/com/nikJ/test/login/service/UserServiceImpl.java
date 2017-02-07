package com.nikJ.test.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nikJ.test.login.dao.UserDao;
import com.nikJ.test.login.vo.UserVo;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserDao userDao;

	@Override
	public UserVo getUser() {
		// TODO Auto-generated method stub
		UserVo userDetail = userDao.userDetail();
		return userDetail;
	}
	
}
