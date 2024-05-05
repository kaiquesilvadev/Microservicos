package com.kaique.hrApiGatewayZuul.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.ReactiveUserDetailsService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.kaique.hrApiGatewayZuul.entities.UserDetail;
import com.kaique.hrApiGatewayZuul.feignclient.UserFeignClient;

import reactor.core.publisher.Mono;

@Service
public class UserService implements ReactiveUserDetailsService {
	
	@Autowired
	private UserFeignClient feignClient;

	@Override
	public Mono<UserDetails> findByUsername(String username) {
	    return Mono.fromCallable(() -> {
	        UserDetail userDetail = feignClient.findByEmail(username);
	        if (userDetail == null) {
	            throw new UsernameNotFoundException("User not found with username: " + username);
	        }
	        String[] array = userDetail.getRoles().toArray(new String[0]);
	        return org.springframework.security.core.userdetails.User
	            .withUsername(userDetail.getEmail())
	            .password(userDetail.getPassword())
	            .roles(array)
	            .build();
	    });
	}

	
}
