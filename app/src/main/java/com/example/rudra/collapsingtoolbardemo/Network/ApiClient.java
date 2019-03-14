package com.example.rudra.collapsingtoolbardemo.Network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

   private static Retrofit retrofit=null;

    public static Retrofit getClient() {

   if(retrofit == null) {

        retrofit = new Retrofit.Builder()

                .baseUrl("http://fishbuoy.com")

                .addConverterFactory(GsonConverterFactory.create())

                .build();

   }
        return retrofit;
    }
}
