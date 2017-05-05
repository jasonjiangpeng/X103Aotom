package com.aotome202.lostjason.x103aotom.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;

import com.aotome202.lostjason.x103aotom.R;
import com.aotome202.lostjason.x103aotom.assist.Logshow;

/**
 * Created by LostJason on 2017/4/24.
 */

public class TestA extends Activity implements View.OnClickListener{
    ImageView ig;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.boot);
   findbyid(ig,R.id.setting);
    //    ig=findViewById(R.id.setting);
        setOnclick(ig);

    }
    public void findbyid(ImageView sv,int id){
        Logshow.logShow("===========xxxxxxxxxxxx=========");
        sv= (ImageView) findViewById(id);
        sv.setVisibility(View.VISIBLE);

    }
    public void setOnclick(View v){

            v.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Logshow.logShow("====================");
    }
}
