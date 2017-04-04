package org.zooark.rest.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import org.zooark.rest.dao.UserRolesDao;
import org.zooark.rest.model.User;
import org.zooark.rest.model.UserRoles;

@Repository
public class UserRolesDaoImpl implements UserRolesDao{

	@PersistenceContext
	private EntityManager em;
	
	public UserRoles findById(int id) {
		UserRoles userRoles = em.find(UserRoles.class, id);
		return userRoles;
	}

	public UserRoles findByRole(String role) {
		return null;
	}
	
	public List<UserRoles> findAll(){
		return em.createQuery("select u from UserRoles u", UserRoles.class).getResultList();
	}
	
}
