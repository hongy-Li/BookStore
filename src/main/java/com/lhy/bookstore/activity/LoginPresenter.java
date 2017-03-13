package com.lhy.bookstore.activity;

import com.app.library.mvp.BasePresenter;
import com.app.library.mvp.IPresenterNotify;
import com.lhy.bookstore.http.IHttpResultListener;
import com.lhy.bookstore.http.LoginHttp;

/**
 * Created by lenovo on 2017/2/23.
 */
public class LoginPresenter extends BasePresenter {
    public LoginPresenter(IPresenterNotify notifyListener) {
        super(notifyListener);
    }
    public void loginLogic(String email,String pwd){
        LoginHttp loginHttp=new LoginHttp(new IHttpResultListener<String>() {
            @Override
            public void Success(String object) {

            }

            @Override
            public void Error(String msg) {

            }
        });
        loginHttp.sendRequestToServer(false,null);
    }
}
