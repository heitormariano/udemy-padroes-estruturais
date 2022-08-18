package br.com.udemy.bridge.backend.dao;

import br.com.udemy.bridge.backend.model.User;

public class UserOracleDao implements UserDao {

	public void save(User user) {
		System.out.println("Saving the user " + user.getName() + " in the Oracle Database");
	}
}
