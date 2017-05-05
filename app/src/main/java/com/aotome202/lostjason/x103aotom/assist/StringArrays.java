package com.aotome202.lostjason.x103aotom.assist;

import android.content.Context;

import com.aotome202.lostjason.x103aotom.R;

/**
 * Created by LostJason on 2017/4/20.
 */

public class StringArrays {
    public static String[] getString(Context context,int index){
        String []  data=null;
        switch (index){
            case 1:
                data=context.getResources().getStringArray(R.array.mirrormul);
                break;
            case 2:
                data=context.getResources().getStringArray(R.array.recoderTime);
                break;
            case 3:
                data=context.getResources().getStringArray(R.array.resolutionratio);
                break;
            case 4:
                data=context.getResources().getStringArray(R.array.luxiangmoshi);
                break;
        }
        return data;
    }
}
