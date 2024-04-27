package com.kaique.hrApiGatewayZuul.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.kaique.hrApiGatewayZuul.feignclient.UserFeignClient;

@Service
public class UserService implements UserDetailsService {

	private static Logger logger = LoggerFactory.getLogger(UserDetail.class);
	
	//@Autowired
	//private UserFeignClient userFeignClient;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserDetail user = null;
		if (user == null) {
			logger.error("Email not found: " + username);
			throw new UsernameNotFoundException("Email not found");
		}
		logger.info("Email found: " + username);
		return user;
	}

}
