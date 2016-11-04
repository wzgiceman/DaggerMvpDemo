package com.wzgiceman.daggerdemo.di.component;

import com.wzgiceman.daggerdemo.di.PerApp;
import com.wzgiceman.daggerdemo.di.module.MvpPresenterModule;
import com.wzgiceman.daggerdemo.mvp.ui.MvpActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by WZG on 2016/11/4.
 */
@PerApp
@Singleton
@Component(modules = MvpPresenterModule.class)
public interface MvpPresenterComponent {

    void inject(MvpActivity activity);

}
