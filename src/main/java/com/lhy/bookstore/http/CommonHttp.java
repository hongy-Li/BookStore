package com.lhy.bookstore.http;

import com.app.library.dialog.IDialog;
import com.app.library.net.BaseHttp;
import com.app.library.net.IHttpListener;

import java.util.Map;

/**
 * Created by lhy on 2017/3/1.
 */
public abstract class CommonHttp<T extends IHttpListener> extends BaseHttp {
    public CommonHttp(T listener) {
        super(listener);
    }

    @Override
    protected void sendRequest(boolean isDialogShow, IDialog dialog, String url, Map params, int method) {
        super.sendRequest(isDialogShow, dialog, url, params, method);
    }

    @Override
    protected void succeedRequest(String msg) {
        super.succeedRequest(msg);

    }

    @Override
    protected void failedRequest(Exception e) {
        super.failedRequest(e);
    }
}
