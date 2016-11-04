package com.wzgiceman.daggerdemo.di.module;

import com.wzgiceman.daggerdemo.di.PerApp;
import com.wzgiceman.daggerdemo.mvp.model.MvpModel;
import com.wzgiceman.daggerdemo.mvp.presenter.MvpPresenter;
import com.wzgiceman.daggerdemo.mvp.ui.MvpActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by WZG on 2016/11/4.
 */
@PerApp
@Module
public class MvpPresenterModule {
    private MvpActivity activity;

    public MvpPresenterModule(MvpActivity activity) {
        this.activity = activity;
    }

    @Provides
    MvpActivity provideActivity(){
        return  activity;
    }

    @Provides
    MvpPresenter providePresenter(MvpActivity ui,MvpModel mvpModel){
        return new MvpPresenter(ui,mvpModel);
    }

    @Provides
    MvpModel provideMvpModel(){
        return new MvpModel();
    }

}
