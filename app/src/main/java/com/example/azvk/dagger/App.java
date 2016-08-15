package com.example.azvk.dagger;

import android.app.Application;

import com.example.azvk.dagger.domain.AnalyticsManager;

import javax.inject.Inject;

import dagger.ObjectGraph;

public class App extends Application{

    private ObjectGraph objectGraph;
    @Inject
    AnalyticsManager analyticsManager;

    @Override
    public void onCreate() {
        super.onCreate();

        objectGraph = ObjectGraph.create(new AppModule(this));
        objectGraph.inject(this);
        analyticsManager.registerAppEnter();
    }

    public ObjectGraph getObjectGraph(){
        return objectGraph;
    }
}
