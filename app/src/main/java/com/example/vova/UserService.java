package com.example.vova;

import android.telecom.Call;

import retrofit2.http.Body;
import retrofit2.http.POST;

public interface UserService {

    @POST("authenticate")
    Call<LoginResponse> userLogin(@Body LoginReguest loginReguest );
}
