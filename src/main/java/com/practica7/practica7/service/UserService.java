package com.practica7.practica7.service;

import com.practica7.practica7.model.User;

public interface UserService {
    
    Iterable<User> getUser();
    void deleteUser(String idUser);
    User updateAlbum(String id, User user);
}
