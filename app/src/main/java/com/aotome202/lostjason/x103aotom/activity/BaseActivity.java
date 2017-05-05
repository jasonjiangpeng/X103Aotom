package com.aotome202.lostjason.x103aotom.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;

import com.aotome202.lostjason.x103aotom.assist.My_ActivityManager;

/**
 * Created by LostJason on 2017/4/20.
 */

public class BaseActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        My_ActivityManager.add(this);
    }

    @Override
    protected void onDestroy() {
      //  My_ActivityManager.exit();
        super.onDestroy();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        My_ActivityManager.exit();
    }
}
