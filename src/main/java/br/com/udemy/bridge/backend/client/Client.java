package br.com.udemy.bridge.backend.client;

import br.com.udemy.bridge.backend.dao.UserMongoDao;
import br.com.udemy.bridge.backend.dao.UserMySqlDao;
import br.com.udemy.bridge.backend.dao.UserOracleDao;
import br.com.udemy.bridge.backend.dao.UserPostgreSqlDao;
import br.com.udemy.bridge.backend.model.User;
import br.com.udemy.bridge.backend.service.UserEJBService;
import br.com.udemy.bridge.backend.service.UserRestService;
import br.com.udemy.bridge.backend.service.UserService;
import br.com.udemy.bridge.backend.service.UserSoapService;

public class Client {

	public static void main(String[] args) {

		User user = new User("Heitor", "teste01@gmail.com", "123456");

		UserService userRestSeriveWithMongoDao = new UserRestService(new UserMongoDao());
		userRestSeriveWithMongoDao.save(user);

		UserService userEJBServiceWithOracleDao = new UserEJBService(new UserOracleDao());
		userEJBServiceWithOracleDao.save(user);

		UserService userSoapServiceWithPostgreSqlDao = new UserSoapService(new UserPostgreSqlDao());
		userSoapServiceWithPostgreSqlDao.save(user);

		UserService userRestServiceWithMySqlDao = new UserRestService(new UserMySqlDao());
		userRestServiceWithMySqlDao.save(user);
	}
}
