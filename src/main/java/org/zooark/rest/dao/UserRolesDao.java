package org.zooark.rest.dao;

import java.util.List;

import org.zooark.rest.model.UserRoles;


public interface UserRolesDao {

	List<UserRoles> findAll();
	
	UserRoles findByRole(String role);
	
	UserRoles findById(int id);
}
