package com.lhy.bookstore.activity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.design.widget.TextInputLayout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.app.library.mvp.BasePresenter;
import com.app.library.mvp.NotifyMessage;
import com.app.library.mvp.PresenterActivity;
import com.app.library.utils.log.L;
import com.lhy.bookstore.R;
import com.lhy.bookstore.http.IHttpResultListener;
import com.lhy.bookstore.http.LoginHttp;
import com.lhy.bookstore.http.RegisterHttp;
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

    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            L.i(TAG,"handleMessage MSG="+msg);
        }

        @Override
        public void dispatchMessage(Message msg) {
            super.dispatchMessage(msg);
            L.i(TAG,"dispatchMessage MSG="+msg);
        }
    };

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_login:
                L.i(TAG, "Login");
                LoginHttp loginHttp=new LoginHttp(new IHttpResultListener<String>() {
                    @Override
                    public void Success(String object) {

                    }

                    @Override
                    public void Error(String msg) {

                    }
                });
                loginHttp.sendRequestToServer(false,null);
                handler.sendEmptyMessage(12);
                break;
        }

    }
}
