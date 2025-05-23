package com.microservices.user.Service;

import com.microservices.user.Entity.User;

import java.util.List;

public interface UserService {
    public User createUser(User user);
    public User updateUser(String uId,User User);
    public List<User> getUSer();
    public User getUSerById(String uId);
    public void deleteUser(String uId);
}
