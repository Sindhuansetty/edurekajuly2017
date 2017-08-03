package co.edureka.dao;

import java.util.ArrayList;

import co.edureka.model.User;

public interface UserDAO {
	void registerUser(User user);
	void deleteUser(User user);
	void updateUser(User user);
	ArrayList<User> retrieveUsers();
}
