package com.nikJ.utils.Spring_Security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class User implements UserDetails {

	private static final long serialVersionUID = -4450269958885980297L;
    private String username;
    private String password;
    private Collection<? extends GrantedAuthority> authorities;
    
    public User(){
    	
    }
    
    public User(String userName, String password)
    {
        this.username = userName;
        this.password = password;
    }

	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
//		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();   
//        authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
        return authorities;
	}
	
	public void setAuthorities(Collection<? extends GrantedAuthority> authorities){
		this.authorities = authorities;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return username;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
