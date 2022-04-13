package com.practica7.practica7.service.implementation;

import com.practica7.practica7.model.User;
import com.practica7.practica7.repository.UserRepository;
import com.practica7.practica7.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService{
    
    @Autowired
    private UserRepository userRepository;

    @Override
    public Iterable<User> getUser(){
        return userRepository.findAll();
    }
    @Override
    public void deleteUser(String idUser){
        userRepository.deleteById(idUser);
        
    }
    @Override
    public User updateAlbum(String id, User user){
        if(userRepository.existsById(id)){
            return userRepository.save(user);
        }else{
            return null;
        }
    }
    
    
}
