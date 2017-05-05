package com.aotome202.lostjason.x103aotom.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.RelativeLayout;

import com.aotome202.lostjason.x103aotom.R;
import com.aotome202.lostjason.x103aotom.assist.ActivityUtils;

/**
 * Created by LostJason on 2017/4/20.
 */

public class Equipment_Settting extends ToolBarActivity implements View.OnClickListener {
  //  RelativeLayout  model,timer,mirror,fenbianlv;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
     //   setContentView(R.layout.device_setting);
        setTitel(R.string.equipment,R.color.hongse);

    }

    @Override
    public int getLayoutID() {
        return R.layout.equipment_setting;
    }

    @Override
    public boolean needS() {
        return true;
    }

    @Override
    public void initUi() {


    }


    @Override
    public void onClick(View v) {


    }
}
