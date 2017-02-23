package com.lhy.bookstore.activity;

import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.app.library.mvp.BasePresenter;
import com.app.library.mvp.NotifyMessage;
import com.app.library.mvp.PresenterActivity;
import com.lhy.bookstore.MainPresenter;
import com.lhy.bookstore.R;
import com.lhy.bookstore.presenter.LoginPresenter;

public class LoginActivity extends PresenterActivity implements View.OnClickListener {
    TextInputLayout til_email, til_pwd;
    EditText et_email, et_pwd;
    Button bt_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getLayoutXML() {
        return R.layout.activity_login;
    }

    @Override
    protected void initView() {
        super.initView();
        til_email = (TextInputLayout) findViewById(R.id.til_email);
        til_pwd = (TextInputLayout) findViewById(R.id.til_pwd);
        et_email = (EditText) findViewById(R.id.et_email);
        et_pwd = (EditText) findViewById(R.id.et_pwd);
        bt_login = (Button) findViewById(R.id.bt_login);
    }

    @Override
    protected void initData() {
        super.initData();
        til_email.setHint("邮箱");
        til_pwd.setHint("密码");
    }

    @Override
    protected void initEvent() {
        super.initEvent();
        bt_login.setOnClickListener(this);
    }

    @Override
    public BasePresenter createPresenter() {
        return new LoginPresenter(this);
    }

    @Override
    public void notify(NotifyMessage message) {

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_login:
                Log.i(TAG, "Login");
                break;
        }

    }
}
