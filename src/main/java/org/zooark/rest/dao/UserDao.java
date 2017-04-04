package org.zooark.rest.dao;

import org.zooark.rest.model.User;


public interface UserDao {
	User findByUsername(String username);
}

