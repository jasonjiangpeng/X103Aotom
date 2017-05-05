package com.aotome202.lostjason.x103aotom.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.aotome202.lostjason.x103aotom.R;
import com.aotome202.lostjason.x103aotom.log.Logshow;

import java.util.Arrays;
import java.util.List;

/**
 * Created by LostJason on 2017/4/20.
 */

public class ItemAdapter extends BaseAdapter {
    List<String> strings;
    Context context;
    public ItemAdapter(String[] stringsss, Context context) {
             // this.strings=strings;
        this.context=context;
        strings = Arrays.asList(stringsss);
     /*   for (int i = 0; i <stringsss.length ; i++) {
            stringsss[i]=null;
        }*/

    }

    @Override
    public int getCount() {
        return strings.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public List<String> getStrings() {
        return strings;
    }

    public void setStrings(List<String> strings) {
        this.strings = strings;
    }
    ItemHolder  itemHolder=null;
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView==null){
            itemHolder=new ItemHolder();
            convertView= LayoutInflater.from(context).inflate(R.layout.item_adapter,null);
            itemHolder.message= (TextView) convertView.findViewById(R.id.tv1);
            itemHolder.img= (ImageView) convertView.findViewById(R.id.img);
            convertView.setTag(itemHolder);
        }else {
            itemHolder= (ItemHolder) convertView.getTag();
        }
    //    Logshow.logShow(strings.get(position).toString());
        itemHolder.message.setText(strings.get(position));
        if (position==count){
            itemHolder.img.setVisibility(View.VISIBLE);
        }else {
            itemHolder.img.setVisibility(View.GONE);
        }
        return convertView;
    }
    public void destory(){
        if (strings!=null){
            strings.clear();
        }
    }
    int count=2;
    public void show(int position){
        this.count=position;

    }
     class ItemHolder{
         TextView message;
         ImageView img;

     }
}
