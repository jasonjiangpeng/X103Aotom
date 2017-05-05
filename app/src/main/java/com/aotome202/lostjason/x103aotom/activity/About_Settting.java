package com.aotome202.lostjason.x103aotom.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.aotome202.lostjason.x103aotom.R;

/**
 * Created by LostJason on 2017/4/20.
 */

public class About_Settting extends ToolBarActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         setTitel(R.string.about,R.color.hongse);
    }

    @Override
    public int getLayoutID() {
        return R.layout.about_setting;
    }

    @Override
    public boolean needS() {
        return true;
    }

    @Override
    public void initUi() {

    }


}
