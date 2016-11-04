package com.wzgiceman.daggerdemo.mvp.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.wzgiceman.daggerdemo.R;
import com.wzgiceman.daggerdemo.di.component.DaggerMvpPresenterComponent;
import com.wzgiceman.daggerdemo.di.component.MvpPresenterComponent;
import com.wzgiceman.daggerdemo.di.module.MvpPresenterModule;
import com.wzgiceman.daggerdemo.mvp.presenter.MvpPresenter;
import com.wzgiceman.daggerdemo.mvp.ui.impl.MvpUiImpl;

import javax.inject.Inject;

public class MvpActivity extends AppCompatActivity implements MvpUiImpl{
    @Inject
    MvpPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvp);
        MvpPresenterComponent component= DaggerMvpPresenterComponent.builder().mvpPresenterModule(new MvpPresenterModule(this))
             .build();
        component.inject(this);

        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.testDoS();
            }
        });
    }



    @Override
    public void showTest(String msg) {
        TextView tv=(TextView)findViewById(R.id.tv);
        tv.setText(msg);
    }
}
