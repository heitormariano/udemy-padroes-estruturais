package br.com.udemy.bridge.backend.service;

import br.com.udemy.bridge.backend.dao.UserDao;
import br.com.udemy.bridge.backend.model.User;

public abstract class UserService {

	protected UserDao userDao;

	public UserService(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public abstract void save(User user);
}
