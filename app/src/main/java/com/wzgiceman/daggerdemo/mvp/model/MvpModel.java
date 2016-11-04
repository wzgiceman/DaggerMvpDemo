package com.wzgiceman.daggerdemo.mvp.model;

import com.wzgiceman.daggerdemo.mvp.bean.MvpEntity;
import com.wzgiceman.daggerdemo.mvp.model.impl.MvpModelImpl;

/**
 * Created by WZG on 2016/11/4.
 */

public class MvpModel implements MvpModelImpl{

    @Override
    public MvpEntity test() {
        return new MvpEntity("数据处理完成返回");
    }
}
