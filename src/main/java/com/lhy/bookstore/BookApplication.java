package com.lhy.bookstore;

import android.os.Environment;

import com.app.library.BaseApplication;
import com.app.library.utils.log.L;

/**
 * Created by lhy on 2017/3/4
 */
public class BookApplication extends BaseApplication {
    private static final String TAG = "BookApplication";

    @Override
    public void onCreate() {
        super.onCreate();
        L.i(TAG, "BookApplication onCreate");
        L.init(true, Environment.getExternalStorageDirectory().getAbsolutePath() + "/bookStore");
    }
}
