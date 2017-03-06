package com.lhy.bookstore.http;

import com.app.library.dialog.IDialog;
import com.app.library.net.BaseHttp;
import com.app.library.net.IHttpListener;
import com.app.library.utils.log.L;

import java.util.Map;

/**
 * Created by lhy on 2017/3/1.
 */
public abstract class CommonHttp<T extends IHttpListener> extends BaseHttp {
    private static final String TAG = "CommonHttp";
    private String mClassName;

    public CommonHttp(T listener) {
        super(listener);
        mClassName = this.getClass().getSimpleName();
    }

    @Override
    protected void sendRequest(boolean isDialogShow, IDialog dialog, String url, Map params, int method) {
        L.i(TAG, mClassName + "-->Begin:Url=" + url + " params=" + params + " method=" + method);
        try {
            super.sendRequest(isDialogShow, dialog, url, params, method);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void succeedRequest(String msg) {
        super.succeedRequest(msg);
        L.i(TAG, mClassName + "-->End|success:" + msg);
    }

    @Override
    protected void failedRequest(Exception e) {
        super.failedRequest(e);
        L.i(TAG, mClassName + "-->End|failed:" + e);
    }
}
