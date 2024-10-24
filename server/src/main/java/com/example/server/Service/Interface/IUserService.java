package com.example.server.Service.Interface;

import com.example.server.DTO.LoginRequest;
import com.example.server.DTO.Response;
import com.example.server.Entity.User;

public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);

}