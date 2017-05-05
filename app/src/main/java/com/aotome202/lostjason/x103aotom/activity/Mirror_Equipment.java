package com.aotome202.lostjason.x103aotom.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.aotome202.lostjason.x103aotom.R;
import com.aotome202.lostjason.x103aotom.adapter.ItemAdapter;
import com.aotome202.lostjason.x103aotom.assist.StringArrays;
import com.aotome202.lostjason.x103aotom.log.Logshow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by LostJason on 2017/4/20.
 */

public class Mirror_Equipment extends ToolBarActivity {
    ListView  listview;
    List<String>  strings;
    ItemAdapter itemAdapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  setContentView(R.layout.mirror_equiment);
        int x =getIntent().getIntExtra("device_boot",1);
        Logshow.logShow("xxx"+x);
        setTitel(setTitel(x),0);
        listview= (ListView) findViewById(R.id.listviewsss);
        strings=new ArrayList<>();
       String[] stringArray = StringArrays.getString(this,x);

        itemAdapter =new ItemAdapter(stringArray,this);
        listview.setAdapter(itemAdapter);
      listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
          @Override
          public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
              itemAdapter.show(position);
              itemAdapter.notifyDataSetChanged();
          }
      });
    }
   public int setTitel(int x){
       switch (x){
           case 1:
            return R.string.mirror;
           case 2:
               return R.string.luxiangTime;
           case 3:
               return R.string.fenbianlvxuanze;
           case 4:
               return R.string.luxiangmodel;
       }
       return 1;
   }
    @Override
    public int getLayoutID() {
        return R.layout.mirror_equiment;
    }

    @Override
    public boolean needS() {
        return true;
    }

    @Override
    protected void onDestroy() {

//        itemAdapter.destory();
        super.onDestroy();
    }

    @Override
    public void initUi() {

    }
}
