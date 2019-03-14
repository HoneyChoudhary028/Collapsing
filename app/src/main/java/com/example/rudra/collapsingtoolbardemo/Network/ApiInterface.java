package com.example.rudra.collapsingtoolbardemo.Network;

import com.example.rudra.collapsingtoolbardemo.Models.LoginRequest;
import com.example.rudra.collapsingtoolbardemo.Models.LoginResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiInterface {

    @POST("index.php?option=com_api")
    Call<LoginResponse> loginApi(@Body LoginRequest request);
}
