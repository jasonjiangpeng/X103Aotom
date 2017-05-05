package com.aotome202.lostjason.x103aotom.activity;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.aotome202.lostjason.x103aotom.R;
import com.aotome202.lostjason.x103aotom.assist.My_ActivityManager;

/**
 * Created by LostJason on 2017/4/20.
 */

public abstract class ToolBarActivity extends Activity  {
    LinearLayout  mainlayout;
    TextView  titel;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        My_ActivityManager.add(this);
        if (needS()){
            setContentView(getLayoutID());
            try {
                mainlayout= (LinearLayout) findViewById(R.id.mainlayout);
                titel= (TextView) findViewById(R.id.titel);
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (mainlayout==null){
                setContentView(R.layout.boot);
                return;
            }
        }
        initUi();

    //   setTitel(t);

    }
       public void gobackO(View view){
           My_ActivityManager.finish(this);
       }
    protected  void setTitel(int message, int  color){ //设置bar颜色和主题
        if (titel==null||mainlayout==null){
            return;
        }
        titel.setText(getResources().getText(message));
        if (color!=0){
            mainlayout.setBackgroundResource(color);
        }

    }

    public abstract int getLayoutID() ;
    public abstract boolean needS() ;
 /*   public void findbyid(View v,int id){
     *//*   if (!(v instanceof View)){
            return;
        }*//*
        v=(View) findViewById(id);
    }*/

    public void setOnclick(View... v){
        if (v.length<1){
            return;
        }
        for (int i = 0; i <v.length ; i++) {
            v[i].setOnClickListener((View.OnClickListener) this);
        }

    }
   // public abstract void setTitel(String titel,int resId) ;

    @Override
    protected void onDestroy() {
        My_ActivityManager.remove(this);
        super.onDestroy();
    }
    public  abstract void initUi();
}
