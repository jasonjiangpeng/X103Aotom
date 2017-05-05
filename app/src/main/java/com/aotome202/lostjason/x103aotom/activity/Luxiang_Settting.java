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

public class Luxiang_Settting extends ToolBarActivity implements View.OnClickListener {
    RelativeLayout  model,timer,mirror,fenbianlv;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
     //   setContentView(R.layout.device_setting);
        setTitel(R.string.luxiang,R.color.hongse);

    }

    @Override
    public int getLayoutID() {
        return R.layout.luxiang_setting;
    }

    @Override
    public boolean needS() {
        return true;
    }

    @Override
    public void initUi() {


        model= (RelativeLayout) findViewById(R.id.mode);
        timer= (RelativeLayout) findViewById(R.id.time);
        mirror= (RelativeLayout) findViewById(R.id.mirror);
        fenbianlv= (RelativeLayout) findViewById(R.id.fenbianlv);

        setOnclick(model,timer,mirror,fenbianlv);
    }


    @Override
    public void onClick(View v) {
        int value=0;
           switch (v.getId()){
               case R.id.mode:
                value=4;
                   break;
               case R.id.time:
                   value=2;
                   break;
               case R.id.mirror:
                   value=1;
                   break;
               case R.id.fenbianlv:
                   value=3;
                   break;
           }
        ActivityUtils.nextActivity(Mirror_Equipment.class,value);
    }
}
