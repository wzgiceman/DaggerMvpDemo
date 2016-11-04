package com.wzgiceman.daggerdemo.di;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by WZG on 2016/11/3.
 */
@Scope
@Documented
@Retention(RUNTIME)
public @interface PerApp {
}
