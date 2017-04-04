package org.zooark.rest.service;

import org.zooark.rest.model.User;


public interface UserService {
	
	User findByUsername(String username) throws Exception;

}