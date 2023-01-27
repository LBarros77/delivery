package com.company.delivery.services;

import com.company.delivery.models.UserModel;

import java.util.List;

public interface IUserService {
//    public UserModel saveUser(UserModel user);
    public List<UserModel> getAllUsers();
}
