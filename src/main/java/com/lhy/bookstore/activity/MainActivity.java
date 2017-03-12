package com.lhy.bookstore.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;

import com.app.library.mvp.BasePresenter;
import com.app.library.mvp.NotifyMessage;
import com.app.library.mvp.PresenterActivity;
import com.lhy.bookstore.R;
import com.lhy.bookstore.adapter.FragmentAdapter;
import com.lhy.bookstore.presenter.MainPresenter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lhy on 2017/3/13
 */
public class MainActivity extends PresenterActivity {
    ViewPager vp_main;
    TabLayout tb_title;

    @Override
    public BasePresenter createPresenter() {
        return new MainPresenter(this);
    }

    @Override
    protected int getLayoutXML() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        super.initView();
        vp_main = (ViewPager) findViewById(R.id.vp_main);
        tb_title = (TabLayout) findViewById(R.id.tb_title);
    }

    @Override
    protected void initData() {
        super.initData();
         String[] titles = new String[]{"推荐", "热点"};
        List<Fragment> fragments = new ArrayList<Fragment>();
//        for (int i = 0; i < titles.length; i++) {
//            Fragment fragment = new MyFragment();
//            Bundle bundle = new Bundle();
//            bundle.putString("text",titles[i]);
//            fragment.setArguments(bundle);
//            fragments.add(fragment);
//        }
        vp_main.setAdapter(new FragmentAdapter(fragments, titles, getSupportFragmentManager(), this));
        tb_title.setupWithViewPager(vp_main);
        tb_title.setTabTextColors(getResources().getColor(R.color.colorPrimary), Color.WHITE);
        tb_title.setTabMode(TabLayout.MODE_SCROLLABLE);
    }

    @Override
    public void notify(NotifyMessage message) {

    }
}
