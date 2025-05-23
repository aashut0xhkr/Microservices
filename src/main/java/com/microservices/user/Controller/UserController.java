package com.microservices.user.Controller;

import com.microservices.user.Entity.User;
import com.microservices.user.Service.imple.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserServiceImpl userService;
    @GetMapping
    public List<User> getUsers(){
        return userService.getUSer();
    }
    @GetMapping("/{uId}")
    public User getUserById(@PathVariable String uId){
        return userService.getUSerById(uId);
    }
    @PostMapping
    public User createUSer(@RequestBody User user) {
        return userService.createUser(user);
    }
    @PutMapping("/{uId}")
    public ResponseEntity<User> updateUser(@PathVariable String uId,@RequestBody User user){
        User user1 = userService.updateUser(uId, user);
        return user1!=null ? ResponseEntity.ok(user1):ResponseEntity.notFound().build();
    }
    @DeleteMapping("/{uId}")
    public ResponseEntity<Void> deleteUser(@PathVariable String uId){
        userService.deleteUser(uId);
        return ResponseEntity.notFound().build();
    }
}



