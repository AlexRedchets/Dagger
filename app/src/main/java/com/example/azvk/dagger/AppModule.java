package com.example.azvk.dagger;

import android.app.Application;
import android.widget.Toast;

import com.example.azvk.dagger.domain.DomainModule;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(
        injects = {
                App.class
        },
        includes = {
                DomainModule.class
        }
)
public class AppModule {

    private App app;

    public AppModule(App app) {
        this.app = app;
    }

    @Provides
    @Singleton
    public Application provideApplication(){
        return app;
    }
}
