package com.example.student.retro.data.model.remote;


import com.example.student.retro.data.model.Post;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface APIService {
    @POST("/posts")
    @FormUrlEncoded
    Call<Post> savePost(@Field("title") String title,
                        @Field("userId") long userId,
                        @Field("body") String body);

}
