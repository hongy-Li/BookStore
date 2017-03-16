package com.lhy.bookstore.fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.app.library.base.BaseFragment;

/**
 * Created by lhy on 2017/3/13
 */
public class Fragment1 extends BaseFragment {
    private String mText;

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            mText = getArguments().getString("text");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        TextView textView = new TextView(getActivity());
        ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(-1, -1);
        textView.setLayoutParams(params);
        textView.setGravity(Gravity.CENTER);
        textView.setTextColor(Color.RED);
        textView.setText(mText);
        return textView;
    }

    @Override
    protected int getLayoutXML() {
        return 0;
    }
}
