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

public class Device_Settting extends ToolBarActivity implements View.OnClickListener {
    RelativeLayout  zhuangzhi,guanyu,luxiang;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
     //   setContentView(R.layout.device_setting);
        setTitel(R.string.setting,0);
         initUi();
    }






    @Override
    public int getLayoutID() {
        return R.layout.device_setting;
    }

    @Override
    public boolean needS() {
        return true;
    }

    @Override
    public void initUi() {
        guanyu= (RelativeLayout) findViewById(R.id.guanyu);
        luxiang= (RelativeLayout) findViewById(R.id.luxiang);
     zhuangzhi= (RelativeLayout) findViewById(R.id.zhuangzhi);

       setOnclick(zhuangzhi,guanyu,luxiang);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.zhuangzhi:
                ActivityUtils.nextActivity(Equipment_Settting.class);
                break;
            case R.id.guanyu:
                ActivityUtils.nextActivity(About_Settting.class);
                break;
            case R.id.luxiang:
                ActivityUtils.nextActivity(Luxiang_Settting.class);
                break;

        }

    }
}
