package com.lhy.bookstore.activity;

import com.app.library.mvp.BasePresenter;
import com.app.library.mvp.IPresenterNotify;
import com.app.library.mvp.NotifyMessage;

/**
 * Created by lenovo on 2017/2/23.
 */
public class LoginPresenter extends BasePresenter {
    public LoginPresenter(IPresenterNotify notifyListener) {
        super(notifyListener);
    }

    public void loginLogic(String email, String pwd) {

        if ("123".equals(email) && "123".equals(pwd)) {
            NotifyMessage message = new NotifyMessage();
            message.what = 1;
            sendNotifyMessage(message);
        }
//        LoginHttp loginHttp=new LoginHttp(new IHttpResultListener<String>() {
//            @Override
//            public void Success(String object) {
//
//            }
//
//            @Override
//            public void Error(String msg) {
//
//            }
//        });
//        loginHttp.sendRequestToServer(false,null);
    }
}
