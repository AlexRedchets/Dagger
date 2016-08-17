package com.example.azvk.dagger;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import io.realm.Realm;
import io.realm.RealmConfiguration;

@Module
public class DBModule {

    @Singleton
    @Provides
    Realm provideRealm(Application application){
        RealmConfiguration realmConfig = new RealmConfiguration
                .Builder(application)
                .deleteRealmIfMigrationNeeded()
                .build();
        Realm.setDefaultConfiguration(realmConfig);
        return Realm.getDefaultInstance();
    }
}
