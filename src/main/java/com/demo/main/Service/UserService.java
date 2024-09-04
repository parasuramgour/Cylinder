package com.demo.main.Service;

import com.demo.main.Entity.User;

public interface UserService {
	
public String addRoles();
	
	public User addCustomer(User customer);
	
	public User updateCustomer(int customerId, User customer) throws Exception;
	
	public User getCustomer(int customerId) throws Exception;
	
	public User addAdmin(User admin);
	
	public User updateAdmin(int userId,User admin) throws Exception;
	
	public User getAdmin(int userId) throws Exception;
}
	
	


