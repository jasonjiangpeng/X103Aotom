package com.aotome202.lostjason.x103aotom;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager!=null){
            com.aotome202.lostjason.x103aotom.log.Logshow.logShow("set");
        }else {
            com.aotome202.lostjason.x103aotom.log.Logshow.logShow("null");
        }

    }
}
