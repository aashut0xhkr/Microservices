package com.microservices.user.Service;

import com.microservices.user.Entity.User;

import java.util.List;

public interface UserService {
    public User createUser(User user);
    public List<User> getUser();
    public User getUserById(Long UserID);
    public void DeleteUserById(Long UserID);
    public User UpdateUser(Long UserID,User user);
}
