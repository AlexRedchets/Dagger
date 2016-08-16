package com.example.azvk.dagger;

import android.app.Application;

public class App extends Application {

    NetComponent netComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        netComponent = DaggerNetComponent.builder()
                .appModule(new AppModule(this))
                .netModule(new NetModule("http://54.186.57.223:3000/"))
                .build();
    }

    public NetComponent getNetComponent(){
        return netComponent;
    }
}
