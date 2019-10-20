package com.example.imoocmusicdemo.activitys;


import android.os.Bundle;
import android.view.View;
import com.example.imoocmusicdemo.R;

public class LoginActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initView();
    }

    private void initView(){
        initNavBar(false,"登录",false);
    }

    public void onRegisterClick(View v){

    }
}
