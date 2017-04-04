package org.zooark.rest.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import org.zooark.rest.model.User;
import org.zooark.rest.model.UserRoles;
import org.zooark.rest.model.list.ListUserRoles;
import org.zooark.rest.service.UserRolesService;
import org.zooark.rest.service.UserService;

@RestController
@RequestMapping("/")
public class AppController {
	
	protected static Logger log = Logger.getLogger(AppController.class);
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private UserRolesService userRolesService;
	
	@RequestMapping(value = "/selectUser/{username}", method = RequestMethod.GET)
	private @ResponseBody User getSelectUser(@PathVariable(value = "username") String username) {
		User user = new User();
		try {
			user = userService.findByUsername(username);
		} catch (Exception e) {
			log.error("Sorry, something wrong!", e);
		}
		return user;
	}
	
	@RequestMapping(value = "/selectRol/{id}", method = RequestMethod.GET)
	private @ResponseBody UserRoles getSelectRol(@PathVariable(value = "id") String id) {
		UserRoles userRoles = new UserRoles();
		try {
			userRoles = userRolesService.findById(Integer.parseInt(id));
		} catch (Exception e) {
			log.error("Sorry, something wrong!", e);
		}
		return userRoles;
	}
	
	@RequestMapping(value = "/selectAllRoles", method = RequestMethod.GET)
	private @ResponseBody ListUserRoles getSelectAllRoles() {
		ListUserRoles result = new ListUserRoles();
		try {
			result.setListUserRoles(userRolesService.findAll());
		} catch (Exception e) {
			log.error("Sorry, something wrong!", e);
		}
		return result;
	}
	
}