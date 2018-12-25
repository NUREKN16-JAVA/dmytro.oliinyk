package ua.nure.kn16.oleynik.usermanagement.db;

import java.util.Collection;

import ua.nure.kn16.oleynik.usermanagement.User;


public interface UserDao {
	User create(User user) throws DatabaseException;
	
	void update(User user) throws DatabaseException;
	
	void delete(User user) throws DatabaseException;
	
	User find(Long id) throws DatabaseException;
	
	Collection findAll() throws DatabaseException;
	
	void setConnectionFactory(ConnectionFactory connectionFactory);
}
