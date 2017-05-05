package com.aotome202.lostjason.x103aotom.activity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;

import com.aotome202.lostjason.x103aotom.R;
import com.aotome202.lostjason.x103aotom.fragment.PreviewFragment;
import com.aotome202.lostjason.x103aotom.fragment.VideoFragment;
import com.aotome202.lostjason.x103aotom.log.Logshow;

import aotom.apputilss.utilcode.utils.ActivityUtils;

/**
 * Created by LostJason on 2017/4/20.
 */

public class BootActivity extends BaseActivity implements View.OnClickListener {
    ImageView setting;
    CheckBox switchs;
    Fragment  fragment;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.boot);
        initUI();
    }
    FragmentTransaction fragmentTransaction;
    private void initUI() {
        setting= (ImageView) findViewById(R.id.setting);
        switchs= (CheckBox) findViewById(R.id.switchs);
        final FragmentManager fragmentManager =getFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragment =new VideoFragment();
       fragmentTransaction.add(R.id.framelayout,fragment);
        fragmentTransaction.commit();
        switchs.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Fragment f=null;
                 if (isChecked){
                     f =new VideoFragment();
                     Logshow.logShow("ff");
                    // fragmentTransaction.replace(R.id.framelayout,fragment);
                 }else {
                     Logshow.logShow("tt");
                     f =new PreviewFragment();
                 }
                switchFragment(f);
               //  fragmentTransaction.show(fragment);
              //  fragmentTransaction.replace(R.id.framelayout,f);
               // fragmentManager.
              //  switchContent(f,fragment);
            //   fragmentTransaction.commit();
            }
        });
        setting.setOnClickListener(this);
    }
    public void switchFragment(Fragment from) {
       if (from==null||from==fragment){
           return;
       }
       if (fragmentTransaction!=null){
           fragmentTransaction.remove(fragment);
           fragmentTransaction=null;
       }

          fragmentTransaction=getFragmentManager().beginTransaction();
    //       fragmentTransaction.remove(fragment);
           fragmentTransaction.replace(R.id.framelayout,from);
           fragmentTransaction.commit();
           fragment=from;



    }
     @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.setting :
                com.aotome202.lostjason.x103aotom.assist.ActivityUtils.nextActivity(Device_Settting.class);
                break;
        }
    }
}
