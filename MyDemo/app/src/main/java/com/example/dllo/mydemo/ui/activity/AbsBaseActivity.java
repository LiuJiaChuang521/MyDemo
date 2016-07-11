package com.example.dllo.mydemo.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

/**
 * Created by dllo on 16/7/11.
 * 抽象类的activity基类
 */

public abstract class AbsBaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView 上方 去掉信息lan
        this.getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
               WindowManager.LayoutParams.FLAG_FULLSCREEN
        );
        //加入一些进入退出的动画
//        overridePendingTransition();
        //绑定布局
        setContentView(setLayout());
        //定制流程
        //1初始化组件
        initViews();
        //2初始化数据
        initDatas();
    }

    //设置xml布局文件
     //protected修饰 子类同胞可以访问
    //返回值是int 因为xml文件R.layout是int类型
    //return layout布局文件
    protected abstract int setLayout();
    //设置监听
    //protected abstract void setOnClickListener();
    //初始化组件
    protected abstract void  initViews();
    //初始化数据
    protected abstract void initDatas();
    //简化findviewById

    /**
     * 泛型 泛指一系列类型 T值得是view的子类
     * @param resId
     * @param <T>
     * @return
     * 简化findViewById
     */
    protected <T extends View> T byView(int resId){
        T t = (T) findViewById(resId);
        return t;
        //简化intent跳转

    }

    /**
     *
     * @param from intent xx.this
     * @param to  xx.class
     */
    protected void goTo(Context from, Class<? extends AbsBaseActivity> to){
        Intent intent = new Intent(from,to);
        startActivity(intent);
    }
    //隐士intent
    protected void goTo(String action ,Uri uri){
        Intent intent = new Intent(action);
        intent.setData(Uri.parse(""));
        startActivity(intent);
    }
    //跳转传值

    /**
     *
     * @param from
     * @param to
     * @param values
     * bundle 一个轻量级数据类型,存储以key values储存
     */
    protected void goTo(Context from,
                        Class<? extends AbsBaseActivity> to,
                        Bundle values){
        Intent intent = new Intent(from,to);
        intent.putExtras(values);
        startActivity(intent);
    }
}
