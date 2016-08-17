package com.example.azvk.dagger;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = DBModule.class)
public interface DBComponent {
    void inject(MainActivity activity);
}
