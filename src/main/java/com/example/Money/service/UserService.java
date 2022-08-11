package com.example.Money.service;

import com.example.Money.entity.User;
import com.example.Money.model.User.UserAuthModel;
import com.example.Money.model.User.UserUpdatePasswordModel;


import java.util.List;

public interface UserService {
    User create(User user);

    User  createAdmin(User user);

    List<User> getAllUsers();

    User getByUserId(Long id);

    User getAuthorized(UserAuthModel userAuthModel);

    User deleteUser(User user);

    User getByUsername(String username);

    String getAuthorizationToken(UserAuthModel userAuthModel);

    User getCurrentUser();

    User getUpdateUser(UserUpdatePasswordModel userUpdatePasswordModel);




}
