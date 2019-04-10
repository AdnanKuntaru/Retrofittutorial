package com.kuntaru.retrofittutorial;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderApi {
    @GET("posts")
    Call<List<Post>> getPosts(); // this retrieve the list of posts
}
