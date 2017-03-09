package com.lhy.bookstore.http;

import com.app.library.dialog.IDialog;
import com.lhy.bookstore.constant.UrlConstants;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lhy on 2017/3/4
 */
public class LoginHttp extends CommonHttp<IHttpResultListener<String>> {
    public LoginHttp(IHttpResultListener<String> listener) {
        super(listener);
    }

    @Override
    public void sendRequestToServer(boolean isShow, IDialog dialog, Object... objects) {
        Map<String,Object> params=new HashMap<>();
        params.put("username","admin");
        params.put("password","yang116");
        sendRequest(isShow,dialog, UrlConstants.URL_LOGIN,params,HTTP_GET);
    }
}
