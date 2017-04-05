package com.nikJ.utils.Spring_Security;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import com.nikJ.test.login.LoginController;

public class CustomAuthenticationProvider implements AuthenticationProvider {
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);


	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		// TODO Auto-generated method stub
		String user_id = (String)authentication.getPrincipal();    
        String user_pw = (String)authentication.getCredentials();
         
         
        logger.info("����ڰ� �Է��� �α��������Դϴ�. {}", user_id + "/" + user_pw);
         
        if(user_id.equals("test")&&user_pw.equals("test")){
            logger.info("���� �α����Դϴ�.");
            List<GrantedAuthority> roles = new ArrayList<GrantedAuthority>();
            roles.add(new SimpleGrantedAuthority("ROLE_USER"));
             
            UsernamePasswordAuthenticationToken result = new UsernamePasswordAuthenticationToken(user_id, user_pw, roles);
            result.setDetails(new User(user_id, user_pw));
            return result;         
        }else{
            logger.info("����� ũ������ ������ Ʋ���ϴ�. ������ �߻��մϴ�.");
            throw new BadCredentialsException("Bad credentials");
        }

	}

	@Override
	public boolean supports(Class<?> authentication) {
		// TODO Auto-generated method stub
		return authentication.equals(UsernamePasswordAuthenticationToken.class);
	}


}
