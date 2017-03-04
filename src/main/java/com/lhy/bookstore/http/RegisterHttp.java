package com.lhy.bookstore.http;

import com.app.library.dialog.IDialog;

/**
 * Created by lhy on 2017/2/24
 */
public class RegisterHttp extends CommonHttp<IHttpResultListener<String>> {

    public RegisterHttp(IHttpResultListener<String> listener) {
        super(listener);
    }

    @Override
    public void sendRequestToServer(boolean isShow, IDialog dialog, Object... objects) {
        sendRequest(isShow, dialog, "", null, HTTP_GET);
    }
}
