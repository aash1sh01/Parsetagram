package com.example.parsetagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("Sw3Yw08DoqpjMGZ82vMYHCmLAatsqoqWMs8GX3dp")
                .clientKey("fZ4PGFBQ9wtdlOrKZ7zBr1ue1HmLjybvYXh4fZkP")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}

