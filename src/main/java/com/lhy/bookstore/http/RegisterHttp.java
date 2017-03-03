package com.lhy.bookstore.http;

import com.app.library.dialog.BaseDialog;
import com.app.library.net.BaseHttp;
import com.app.library.net.IHttpListener;

import org.json.JSONObject;

/**
 * Created by lhy on 2017/2/24
 */
public class RegisterHttp extends CommonHttp<IHttpResultListener<String>>{
    public RegisterHttp(IHttpListener listener) {
        super(listener);
    }
}
