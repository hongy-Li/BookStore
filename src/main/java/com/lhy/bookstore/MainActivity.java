package com.lhy.bookstore;

import android.os.Bundle;

import com.app.library.mvp.BasePresenter;
import com.app.library.mvp.NotifyMessage;
import com.app.library.mvp.PresenterActivity;

public class MainActivity extends PresenterActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getLayoutXML() {
        return R.layout.activity_main;
    }

    @Override
    public BasePresenter createPresenter() {
        return new MainPresenter(this);
    }

    @Override
    public void notify(NotifyMessage message) {

    }
}
