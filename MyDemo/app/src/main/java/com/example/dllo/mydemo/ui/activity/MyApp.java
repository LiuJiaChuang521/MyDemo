package com.example.dllo.mydemo.ui.activity;

import android.app.Application;
import android.content.Context;

/**
 * Created by dllo on 16/7/11.
 */
public class MyApp extends Application{
    //application是当前应用 ,只存在一个
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        //oncreate中初始化
        context = getApplicationContext();
    }
    //对外提供get方法
    public static Context getContext() {
        return context;
    }
}
