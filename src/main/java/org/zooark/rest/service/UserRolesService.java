package org.zooark.rest.service;

import java.util.List;

import org.zooark.rest.model.UserRoles;


public interface UserRolesService {

	UserRoles findById(int id);

	UserRoles findByRole(String type);
	
	List<UserRoles> findAll();
	
}
