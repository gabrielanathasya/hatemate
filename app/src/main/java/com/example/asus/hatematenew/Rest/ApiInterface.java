package com.example.asus.hatematenew.Rest;
import com.example.asus.hatematenew.Model.Login;
import com.example.asus.hatematenew.Model.User;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface ApiInterface {
    @POST("login")
    Call<ResponseBody> Login(@Body Login login);

    @GET("user")
    Call<User> GetUsers();

    @POST("user")
    Call<User> AddUser(@Body User users);
}