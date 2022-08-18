package br.com.udemy.bridge.backend.dao;

import br.com.udemy.bridge.backend.model.User;

public class UserPostgreSqlDao implements UserDao {

	public void save(User user) {
		System.out.println("Saving the user " + user.getName() + " in the PostgreSQL Database");
	}
}
