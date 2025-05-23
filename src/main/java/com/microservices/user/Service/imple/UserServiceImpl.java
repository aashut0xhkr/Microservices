package com.microservices.user.Service.imple;

import com.microservices.user.Entity.User;
import com.microservices.user.Exception.UserDefinedException;
import com.microservices.user.Repository.UserRepository;
import com.microservices.user.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user){
        return userRepository.save(user);
    }

    @Override
    public User updateUser(String uId,User user){
        User uSerById = getUSerById(uId);
        if(uSerById==null) return null;
        uSerById.setName(user.getName());
        uSerById.setAbout(user.getAbout());
        uSerById.setEmail(user.getEmail());
        return userRepository.save(uSerById);
    }
    @Override
    public List<User> getUSer(){
        return userRepository.findAll();
    }
    @Override
    public User getUSerById(String uId){
        return userRepository.findById(uId).orElseThrow(()->new UserDefinedException("No User Found"));
    }
    @Override
    public void deleteUser(String uId){
        userRepository.deleteById(uId);
    }
}
