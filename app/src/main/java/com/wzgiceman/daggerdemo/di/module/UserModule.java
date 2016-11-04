package com.wzgiceman.daggerdemo.di.module;

import com.wzgiceman.daggerdemo.entity.User;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by WZG on 2016/11/2.
 */
@Module
public class UserModule {

    @Provides
    @Singleton
    User provideUser(){
        return new User("xxxx","SEX","XXX@Gmail.com");
    }
}
