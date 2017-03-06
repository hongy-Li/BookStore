package com.lhy.bookstore.http;

import com.app.library.dialog.IDialog;
import com.lhy.bookstore.constant.UrlConstants;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lhy on 2017/2/24
 */
public class RegisterHttp extends CommonHttp<IHttpResultListener<String>> {

    public RegisterHttp(IHttpResultListener<String> listener) {
        super(listener);
    }

    @Override
    public void sendRequestToServer(boolean isShow, IDialog dialog, Object... objects) {
        Map<String,Object> params=new HashMap<>();
        params.put("email","123456.qq.com");
        params.put("password","hahahah");
        sendRequest(isShow,dialog, UrlConstants.URL_REGISTER,params,HTTP_POST);
    }
}
