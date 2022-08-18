package br.com.udemy.bridge.backend.service;

import br.com.udemy.bridge.backend.dao.UserDao;
import br.com.udemy.bridge.backend.model.User;

public class UserEJBService extends UserService {

	public UserEJBService(UserDao userDao) {
		super(userDao);
	}

	@Override
	public void save(User user) {
		System.out.println("Save operation of " + this.getClass().getSimpleName() + " class");
		this.userDao.save(user);
	}

}
