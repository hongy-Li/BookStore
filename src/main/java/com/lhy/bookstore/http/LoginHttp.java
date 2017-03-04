package com.lhy.bookstore.http;

import com.app.library.dialog.IDialog;

/**
 * Created by lhy on 2017/3/4
 */
public class LoginHttp extends CommonHttp<IHttpResultListener<String>> {
    public LoginHttp(IHttpResultListener<String> listener) {
        super(listener);
    }

    @Override
    public void sendRequestToServer(boolean isShow, IDialog dialog, Object... objects) {

    }
}
