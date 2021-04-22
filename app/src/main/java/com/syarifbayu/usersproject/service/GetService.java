package com.syarifbayu.usersproject.service;

import com.syarifbayu.usersproject.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetService {
    @GET("/users")
    Call<List<User>> getUsersList();
}
