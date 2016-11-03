package com.girnarsoft.service;

import java.util.HashMap;
import java.util.Map;

import com.girnarsoft.dto.User;

public class LoginService {
	private Map<String, User> userDetails = new HashMap<String, User>();
	private Map<String, String> authenticationDetails = new HashMap<String, String>();

	{
		authenticationDetails.put("sohanlal", "passwd1");
		authenticationDetails.put("ashok", "passwd2");
		userDetails.put("sohanlal", new User("sohanlal", "Sohan Lal"));
		userDetails.put("ashok", new User("ashok", "Ashok"));
	}

	public boolean authenticate(String userId, String password) {
		if (userId == null || password == null) {
			return false;
		}
		boolean userExists = authenticationDetails.containsKey(userId);
		return userExists && password.equals(authenticationDetails.get(userId));
	}

	public User getUser(String userId) {
		return userDetails.get(userId);
	}
}
