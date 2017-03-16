package com.lhy.bookstore.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.support.design.widget.TextInputLayout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.app.library.mvp.NotifyMessage;
import com.app.library.mvp.PresenterActivity;
import com.app.library.utils.log.L;
import com.lhy.bookstore.R;
import com.lhy.netlibrary.IProgressListener;
import com.lhy.netlibrary.IRequestListener;
import com.lhy.netlibrary.okhttp.OKHttpUtils;

public class LoginActivity extends PresenterActivity<LoginPresenter> implements View.OnClickListener {
    TextInputLayout til_email, til_pwd;
    EditText et_email, et_pwd;
    Button bt_login;
    Button bt_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getLayoutXML() {
        return R.layout.activity_login;
    }

    @Override
    protected void initView() {
        super.initView();
        til_email = (TextInputLayout) findViewById(R.id.til_email);
        til_pwd = (TextInputLayout) findViewById(R.id.til_pwd);
        et_email = (EditText) findViewById(R.id.et_email);
        et_pwd = (EditText) findViewById(R.id.et_pwd);
        bt_login = (Button) findViewById(R.id.bt_login);
        bt_register = (Button) findViewById(R.id.bt_register);
    }

    @Override
    protected void initData() {
        super.initData();
        til_email.setHint("邮箱");
        til_pwd.setHint("密码");
    }

    @Override
    protected void initEvent() {
        super.initEvent();
        bt_login.setOnClickListener(this);
        bt_register.setOnClickListener(this);
    }

    @Override
    public LoginPresenter createPresenter() {
        return new LoginPresenter(this);
    }

    @Override
    public void notify(NotifyMessage message) {
        int what = message.what;
        switch (what) {
            case 1:
                Intent intent = new Intent();
                intent.setClass(this, MainActivity.class);
                startActivity(intent);
                break;
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_login: {
                L.i(TAG, "Login");
//                String email = et_email.getText().toString().trim();
//                String pwd = et_pwd.getText().toString().trim();
//                mPresenter.loginLogic(email, pwd);

//                String url = "http://cloud-robot-diy.oss-cn-beijing.aliyuncs.com/vedio/1150942___rec_0xb9128440_[2106-12-30]9_54_52_1.mp4";
                String url = "http://60.205.149.3:8888/v1.0/code";

                String path = Environment.getExternalStorageDirectory().getAbsolutePath() + "/Download";
                OKHttpUtils.getInstance().downloadFileWithProgress(url, path, "haha", new IProgressListener() {
                    @Override
                    public void onSucceed(String msg) {
                        L.i(TAG, "MSG=" + msg);
                    }

                    @Override
                    public void onFailed(Exception e) {
                        L.i(TAG, "e=" + e.toString());
                    }

                    @Override
                    public void progress(long currentBytes, long totalBytes, boolean done) {
                        L.i(TAG, "currentBytes=" + currentBytes + " totalBytes=" + totalBytes + " done=" + done);
                    }
                });
            }
            break;
            case R.id.bt_register: {
                String url = "http://60.205.149.3:8888/v1.0/transition/robot/uploadResource/1";
                String path = Environment.getExternalStorageDirectory().getAbsolutePath() + "/Download/haha.mp4";
                OKHttpUtils.getInstance().uploadFileWithProgress(url, path, "", new IProgressListener() {
                    @Override
                    public void progress(long currentBytes, long totalBytes, boolean done) {
                        L.i(TAG, "currentBytes=" + currentBytes + " totalBytes=" + totalBytes + " done=" + done);
                    }

                    @Override
                    public void onSucceed(String msg) {
                        L.i(TAG, "MSG=" + msg);
                    }

                    @Override
                    public void onFailed(Exception e) {
                        L.i(TAG, "e=" + e.toString());
                    }
                });


            }
            break;
        }
    }

    public void normalRequest(View view) {
        String url = "http://60.205.149.3:8888/v1.0/robot/findBindUser/100000002808";
        OKHttpUtils.getInstance().postRequest(url, null, new IRequestListener() {
            @Override
            public void onSucceed(String msg) {
                L.i(TAG, "msg=" + msg);
            }

            @Override
            public void onFailed(Exception e) {

            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        L.i(TAG, "onDestroy");
    }
}
