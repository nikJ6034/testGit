package com.nikJ.utils.Spring_Security;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.StandardPasswordEncoder;
import org.springframework.stereotype.Service;

import com.nikJ.test.login.dao.UserDao;
import com.nikJ.test.login.vo.UserVo;

@Service
public class UserService implements UserDetailsService{

	@Autowired
	private UserDao userDao;
	private User user;

	 public void setUser(User user) {
	  this.user = user;
	 }
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		StandardPasswordEncoder encoder = new StandardPasswordEncoder();
		UserVo userDetail = userDao.userDetail();
		
		user.setUsername(username);
		user.setPassword(encoder.encode(userDetail.getPassword()));
		//권한 부여
		ArrayList<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
		user.setAuthorities(authorities);
		
		return user;
	}

}
