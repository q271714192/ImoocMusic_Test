package com.example.imoocmusicdemo.activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.imoocmusicdemo.R;
import com.example.imoocmusicdemo.activitys.utils.UserUtils;

public class MeActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_me);

        initView();
    }

    private void initView(){
        initNavBar(true,"个人中心",false);
    }

    /**
     * 修改密码点击事件
     */
    public void onChangeClick(View v){
        startActivity(new Intent(this,ChangePasswordActivity.class));
    }

    /**
     * 退出登录按钮
     */
    public void onLogoutClick(View v){
        UserUtils.logout(this);
    }
}
