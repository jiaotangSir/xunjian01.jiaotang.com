package com.jiaotang.xunjian01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import cn.bmob.v3.Bmob;
import cn.bmob.v3.BmobUser;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.SaveListener;

public class LoginActivity extends AppCompatActivity {

    private EditText userName;
    private EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Bmob.initialize(this,"ea2bb470019fa183ce915a211ed072d9");

    }

    public void loginClick(View v){
        userName = (EditText) findViewById(R.id.editText_name);
        password = (EditText) findViewById(R.id.editText_password);

        BmobUser bmobUser = new BmobUser();
        bmobUser.setUsername(userName.getText().toString());
        bmobUser.setPassword(password.getText().toString());
        bmobUser.login(new SaveListener<BmobUser>() {
            @Override
            public void done(BmobUser bmobUser, BmobException e) {
                if (e==null){
                    Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                    startActivity(intent);
                }else {
                    Toast.makeText(LoginActivity.this,"错误信息："+e.getMessage(),Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
