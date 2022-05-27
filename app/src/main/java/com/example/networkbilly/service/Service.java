package com.example.networkbilly.service;


import com.example.networkbilly.model.UserResponseItem;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Service {

    @GET("/users")
    Call<List<UserResponseItem>> getDataUser();

}