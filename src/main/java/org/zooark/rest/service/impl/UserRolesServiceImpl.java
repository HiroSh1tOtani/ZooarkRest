package org.zooark.rest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.zooark.rest.dao.UserRolesDao;
import org.zooark.rest.model.UserRoles;
import org.zooark.rest.service.UserRolesService;


@Service
public class UserRolesServiceImpl implements UserRolesService{
	
	@Autowired
	private UserRolesDao dao;
	
	public UserRoles findById(int id) {
		return dao.findById(id);
	}

	public UserRoles findByRole(String type){
		return dao.findByRole(type);
	}

	public List<UserRoles> findAll() {
		return dao.findAll();
	}
}
