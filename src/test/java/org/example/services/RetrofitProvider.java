package org.example.services;

import org.example.services.model.Lazy;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitProvider {
    private static final Lazy<Retrofit> RETROFIT_LAZY = new Lazy<>(() -> new Retrofit.Builder()
            .baseUrl("https://demoqa.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build());

    public static Retrofit getInstance(){
        return RETROFIT_LAZY.get();
    }
}
