package com.wzgiceman.daggerdemo.mvp.presenter;

import com.wzgiceman.daggerdemo.mvp.bean.MvpEntity;
import com.wzgiceman.daggerdemo.mvp.model.impl.MvpModelImpl;
import com.wzgiceman.daggerdemo.mvp.ui.impl.MvpUiImpl;

/**
 * Created by WZG on 2016/11/4.
 */

public class MvpPresenter {
    MvpUiImpl ui;
    MvpModelImpl model;


    public MvpPresenter(MvpUiImpl ui, MvpModelImpl model) {
        this.ui = ui;
        this.model = model;
    }

    public void testDoS() {
        MvpEntity entity = model.test();
        ui.showTest(entity.getMsg());
    }

}
