package org.zooark.rest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.zooark.rest.dao.UserDao;
import org.zooark.rest.model.User;
import org.zooark.rest.service.UserService;


@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao dao;

	public User findByUsername(String username) {
		User user = dao.findByUsername(username);
		return user;
	}

	public boolean isUserUsernameUnique(Integer id, String sso) {
		User user = findByUsername(sso);
		return ( user == null || ((id != null) && (user.getId() == id)));
	}
	
}
