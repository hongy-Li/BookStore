package com.lhy.bookstore.http;

import com.app.library.dialog.BaseDialog;
import com.app.library.net.BaseHttp;
import com.app.library.net.IHttpListener;

import org.json.JSONObject;

import java.util.Map;

/**
 * Created by lhy on 2017/3/1.
 */
public class CommonHttp<T extends IHttpListener> extends BaseHttp {
    public CommonHttp(IHttpListener listener) {
        super(listener);
    }

    @Override
    protected void sendRequest(boolean isDialogShow, BaseDialog dialog, String url, Map params, int method) {
        super.sendRequest(isDialogShow, dialog, url, params, method);
    }

    //    @Override
//    public void sendRequestToServer(boolean isDialogShow, BaseDialog dialog,Map<String,Object> params) {
//        sendRequest(isDialogShow,dialog,params);
//    }
//
//    @Override
//    protected void parseData(String ret, JSONObject jsonObject) {
//
//    }
//
//    @Override
//    protected void parseFailData(String ret, String jsonObject) {
//
//    }



}
