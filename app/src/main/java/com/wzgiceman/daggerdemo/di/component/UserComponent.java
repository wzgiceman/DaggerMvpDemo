package com.wzgiceman.daggerdemo.di.component;

import com.wzgiceman.daggerdemo.MainActivity;
import com.wzgiceman.daggerdemo.di.PerApp;
import com.wzgiceman.daggerdemo.di.module.UserModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by WZG on 2016/11/2.
 */
@PerApp
@Singleton
@Component(modules = UserModule.class,dependencies = InfoComponent.class)
public interface UserComponent {

    void inject(MainActivity mainActivity);
}
