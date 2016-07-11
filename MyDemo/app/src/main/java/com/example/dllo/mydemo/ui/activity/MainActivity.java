package com.example.dllo.mydemo.ui.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.dllo.mydemo.R;
import com.example.dllo.mydemo.tools.L;

public class MainActivity extends AbsBaseActivity{
   private TextView tvMain;

    /**
     * 为什么写基类
     * /规定项目整体界面风格
     * @return
     * 扩展 :注解 butterKnife插件
     *
     */

    @Override protected int setLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initViews() {
//       tvMain = (TextView) findViewById(R.id.tv_main);
        tvMain = byView(R.id.tv_main);
        L.e("运行了");
    }

    @Override
    protected void initDatas() {
        tvMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this,SecondActivity.class) ;
//                startActivity(intent);
//                goTo(MainActivity.this,SecondActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("name" ,"张三");
                bundle.putInt("num" , 111);
                goTo(MainActivity.this,SecondActivity.class,bundle);
            }
        });
    }
}
