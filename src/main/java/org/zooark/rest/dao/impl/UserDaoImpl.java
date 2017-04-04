package org.zooark.rest.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import org.zooark.rest.dao.UserDao;
import org.zooark.rest.model.User;

@Repository
public class UserDaoImpl implements UserDao {
	
	@PersistenceContext
	private EntityManager em;

	public User findByUsername(String username) {
		User user = em.createQuery("select u from User u where u.username = :username", User.class)
				.setParameter("username", username).getSingleResult();
		return user;
	}

}
