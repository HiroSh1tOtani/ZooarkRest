package org.zooark.rest.model;

import java.io.Serializable;

public enum UserRolesType implements Serializable{
	USER("USER"),
	DBA("DBA"),
	ADMIN("ADMIN");
	
	String userRolesType;
	
	private UserRolesType(String userRolesType){
		this.userRolesType = userRolesType;
	}
	
	public String getUserRolesType(){
		return userRolesType;
	}
	
}
