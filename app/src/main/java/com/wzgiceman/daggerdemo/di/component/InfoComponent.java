package com.wzgiceman.daggerdemo.di.component;

import com.wzgiceman.daggerdemo.di.module.InfoModule;
import com.wzgiceman.daggerdemo.entity.Info;

import dagger.Component;

/**
 * Created by WZG on 2016/11/3.
 */
@Component(modules = {InfoModule.class})
public interface InfoComponent {

    Info infoMoudule();
}
