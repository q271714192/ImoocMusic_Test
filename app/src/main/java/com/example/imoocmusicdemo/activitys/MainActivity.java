package com.example.imoocmusicdemo.activitys;


import android.os.Bundle;

import com.example.imoocmusicdemo.R;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView(){
        initNavBar(false,"慕课音乐",true);
    }
}
