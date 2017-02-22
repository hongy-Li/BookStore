package com.lhy.bookstore.activity;

import android.os.Bundle;

import com.app.library.mvp.BasePresenter;
import com.app.library.mvp.NotifyMessage;
import com.app.library.mvp.PresenterActivity;
import com.lhy.bookstore.MainPresenter;
import com.lhy.bookstore.R;
import com.lhy.bookstore.presenter.LoginPresenter;

public class LoginActivity extends PresenterActivity {

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
        return new LoginPresenter(this);
    }

    @Override
    public void notify(NotifyMessage message) {

    }
}
