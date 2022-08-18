package br.com.udemy.bridge.backend.dao;

import br.com.udemy.bridge.backend.model.User;

public class UserMySqlDao implements UserDao {

	public void save(User user) {
		System.out.println("Saving the user " + user.getName() + " in the MySQL Database");
	}
}
