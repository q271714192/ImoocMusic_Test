package com.example.imoocmusicdemo.activitys;


import android.content.Intent;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.View;
import com.example.imoocmusicdemo.R;
import com.example.imoocmusicdemo.activitys.utils.UserUtils;

import views.Inputview;

public class LoginActivity extends BaseActivity {

    private Inputview mInputPhone,mInputPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initView();
    }

    private void initView(){
        initNavBar(false,"登录",false);

        mInputPhone = fd(R.id.input_phone);
        mInputPassword = fd(R.id.input_password);
    }

//跳转注册按钮点击事件
    public void onRegisterClick(View v){
        Intent intent = new Intent(this,RegisterActivity.class);
        startActivity(intent);
//        finish();
    }

//    实现登录按钮点击事件
    public void onCommitClick (View v){
//        获取用户输入的手机号
        String phone = mInputPhone.getInputStr();
//        获取用户输入的密码
        String password = mInputPassword.getInputStr();
//验证用户输入是否合法
        if(!UserUtils.validateLogin(this,phone,password)){
            return;
        }
//跳转到主界面
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        finish();
    }

}
