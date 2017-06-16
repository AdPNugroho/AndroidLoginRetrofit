package com.ultimate.mobilesisfo.api;

import com.ultimate.mobilesisfo.model.LoginValue;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface LoginAPI {
    @FormUrlEncoded
    @POST("dashboard/login")
    Call<LoginValue> daftar(@Field("username") String username,
                            @Field("password") String password);
}
