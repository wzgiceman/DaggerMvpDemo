package com.wzgiceman.daggerdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.wzgiceman.daggerdemo.di.component.DaggerInfoComponent;
import com.wzgiceman.daggerdemo.di.component.DaggerUserComponent;
import com.wzgiceman.daggerdemo.di.component.InfoComponent;
import com.wzgiceman.daggerdemo.di.component.UserComponent;
import com.wzgiceman.daggerdemo.di.module.InfoModule;
import com.wzgiceman.daggerdemo.di.module.UserModule;
import com.wzgiceman.daggerdemo.entity.Info;
import com.wzgiceman.daggerdemo.entity.User;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    User user;
    @Inject
    Info info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InfoComponent infoComponent= DaggerInfoComponent.builder().infoModule(new InfoModule("AAAAA")).build();
        UserComponent  component= DaggerUserComponent.builder().userModule(new UserModule()).infoComponent(infoComponent).build();
        component.inject(this);
        TextView textView=(TextView)findViewById(R.id.tv);
        textView.setText("name:"+user.getName()+"\nsex:"+user.getSex()+"\nads:"+user.getAds()+"\ninfo->>>"+info.getMsg());
    }
}
