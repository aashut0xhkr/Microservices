package com.microservices.user.Service.ServiceImpl;

import com.microservices.user.Entity.User;
import com.microservices.user.Exception.CustomException;
import com.microservices.user.Repository.UserRepo;
import com.microservices.user.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public User createUser(User user){
        return userRepo.save(user);
    }
    @Override
    public List<User> getUser(){
        return userRepo.findAll();
    }
    @Override
    public User getUserById(Long UserID){
        return userRepo.findById(UserID).orElseThrow(()->new CustomException("USer not found"));
    }
    @Override
    public void DeleteUserById(Long UserID){
        userRepo.findById(UserID).orElseThrow(()->new CustomException("USer not found"));
        userRepo.deleteById(UserID);
    }
    @Override
    public User UpdateUser(Long UserID,User user){
        User userById = getUserById(UserID);
        if(userById==null) return null;
        userById.setName(user.getName());
        userById.setEmail(user.getEmail());
        userById.setAbout(user.getAbout());
        return userRepo.save(userById);
    }

}
